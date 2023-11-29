package com.example.parser;

import com.example.parser.interpreter.AmlDslInterpreter;
import com.example.parser.interpreter.EvaluationContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;
import static junit.framework.TestCase.assertTrue;

public class ParserApplicationTests {

	@Test
	public void testCalcExpression() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		ParseTree ast = parser.parseExpression("-(-4 + 8 * (6 -2))");

		BigDecimal a = (BigDecimal) parser.getValue(ast);
		assertEquals(a.intValue(),-28);
		ast =  parser.parseExpression("8+5");
		a = (BigDecimal) parser.getValue(ast);
		assertEquals(a.intValue() , 13);
		ast = parser.parseExpression("8 mod 5");
		a = (BigDecimal) parser.getValue(ast);
		assertEquals(a.intValue(),3);

		//Adding strings
		ast = parser.parseExpression("'test' + ' ' + 'string'");
		assertEquals( parser.getValue(ast ) , "test string");
	}

	@org.junit.Test
	public void testLogExpression() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		ParseTree ast = parser.parseExpression("true or false");
		boolean b = (boolean) parser.getValue(ast);
		assertTrue(b);
		ast = parser.parseExpression("8<9 && 8==5*2");
		boolean c = (boolean) parser.getValue(ast);
		assertFalse(c);
		ast = parser.parseExpression("not (8 lt 9 and 8 eq 5 div 2)");
		boolean f = (boolean) parser.getValue(ast);
		assertTrue(f);
		ast = parser.parseExpression("(9 * 2 != (2 * 9)) == ((1-1) == (19 - 1))");
		boolean d = (boolean) parser.getValue(ast);
		assertTrue(d);
	}

	@org.junit.Test
	public void testVariablesExpression() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		Person person = new Person("John", 25);
		Person person2 = new Person("Mike", 30);
		Person friend = new Person("Mike's friend" , 10);
		person2.setFriend(friend);

		EvaluationContext context = new EvaluationContext();
		context.addVariable("person" , person2);

		ParseTree ast = parser.parseExpression("'name'");
		assertEquals(parser.getValue(ast), "name" );

		ast = parser.parseExpression("person.age > person.friend.age");
		assertTrue((Boolean) parser.getValue(ast, context));

		ast = parser.parseExpression("name");
		assertEquals(parser.getValue(ast, person) , "John");

		ast =  parser.parseExpression("age +5.5");
		BigDecimal a = (BigDecimal) parser.getValue(ast, person) ;
		assertEquals(a.doubleValue() , 30.5);

		ast = parser.parseExpression("person.age");
		int b = (Integer) parser.getValue(ast, context);
		assertEquals(b, 30);

		ast =  parser.parseExpression("age");
		int c = (Integer) parser.getValue(ast, person);
		assertEquals(c, 25);

		ast = parser.parseExpression("stat");
		assertEquals(parser.getValue(ast, person) , 1);

		ast = parser.parseExpression("person.friend.age");
		assertEquals(parser.getValue(ast, context) , 10);
	}

	@org.junit.Test
	public void testFunctionsExpression() throws NoSuchMethodException {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		Person person = new Person("Mike", 30);
		Person friend = new Person("Mike's friend" , 10);
		person.setFriend(friend);
		EvaluationContext context = new EvaluationContext(person);
		context.registerFunction("reverseString" , StringUtils.class.getDeclaredMethod("reverseString" , String.class));
		context.registerFunction("prefix" , StringUtils.class.getDeclaredMethod("prefix" , String.class, int.class));

		// String methods
		ParseTree ast = parser.parseExpression("'hello'.substring(2,3)");
		assertEquals(parser.getValue(ast) , "l");
		ast = parser.parseExpression("'hello'.length()");
		assertEquals(parser.getValue(ast) , 5);

		// object methods
		ast = parser.parseExpression("sayHello()");
		assertEquals(parser.getValue(ast , context) , "Mike hello");
		ast = parser.parseExpression("friend.olderThan(20)");
		assertFalse((boolean)parser.getValue(ast , context));
		ast = parser.parseExpression("sumAge(friend)");
		assertEquals(parser.getValue(ast , context) , 40);

		// chaining methods
		ast = parser.parseExpression("sayHello().substring(2,3)");
		assertEquals(parser.getValue(ast , context) , "k");

		// registered functions
		ast = parser.parseExpression("#reverseString('hello')");
		assertEquals(parser.getValue(ast , context) , "olleh");
		ast = parser.parseExpression("#reverseString('hello').length()");
		assertEquals(parser.getValue(ast , context) , 5);
		ast = parser.parseExpression("#prefix(name , 2)");
		assertEquals(parser.getValue(ast , context) , "Mi");
	}

	@org.junit.Test
	public void testMapListsExpression() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		Person person = new Person("Mike", 30);
		Person enemy = new Person("Mike's enemy" , 10);

		person.addNote(2);
		person.addNote(6);
		person.addToDict("number" , 9);
		person.addToDict("enemy" , enemy);
		List<Integer> numbers = new ArrayList<>(List.of(1,2,3)) ;
		person.addToDict("list" , numbers);
		EvaluationContext context = new EvaluationContext(person);

		//List test
		ParseTree ast = parser.parseExpression("notes[0]");
		assertEquals(parser.getValue(ast , context) , 2);

		//Map test
		ast = parser.parseExpression("dict['number']");
		assertEquals(parser.getValue(ast , context) , 9);

		//List inside map test
		ast = parser.parseExpression("dict['list'][1]");
		assertEquals(parser.getValue(ast , context) , 2);

		//Map property
		ast = parser.parseExpression("dict['enemy'].name");
		assertEquals(parser.getValue(ast , context) , "Mike's enemy");

		//Map property chained method
		ast = parser.parseExpression("dict['enemy'].name.length()");
		assertEquals(parser.getValue(ast , context) , 12);

		//List initialization
		ast = parser.parseExpression("{1,5.5,'aa'}");
		List l = (List) parser.getValue(ast ) ;
		assertTrue(l.contains("aa"));
		assertTrue(l.contains(new BigDecimal("5.5")));

		ast = parser.parseExpression("{1,2,3}");
		List list = (List) parser.getValue(ast ) ;
		assertTrue(list.contains(new BigDecimal("2")));
		assertTrue(list.contains(new BigDecimal("3")));
		assertTrue(list.contains(new BigDecimal("1")));
	}

	@org.junit.Test
	public void testListMethods() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		ParseTree ast = parser.parseExpression("{{'a','b'},{'x','y'}}.size()");
		Object size = parser.getValue(ast);
		assertTrue(size instanceof Integer);
		assertEquals(size , 2);
	}

	@org.junit.Test
	public void testListMethods2() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		ParseTree ast = parser.parseExpression("{'a','b','x','y'}[0]");
		Object elmt = parser.getValue(ast);
		assertTrue(elmt instanceof String);
		assertEquals(elmt , "a");
	}

	@org.junit.Test
	public void testListSelection() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		Person person = new Person("John", 25);
		Person person2 = new Person("Mike", 30);
		Person friend = new Person("Mike's friend" , 10);

		List<Person> list = List.of(person , person2 , friend) ;
		EvaluationContext context = new EvaluationContext();
		context.addVariable("members" , list);

		ParseTree ast = parser.parseExpression("members.?[age < 17 OR age == 18]");
		List result = (List) parser.getValue(ast , context) ;
		assertEquals(result.size() , 1);
		assertTrue(result.contains(friend));

		ast = parser.parseExpression("members.?[name == 'John'][0].age");
		assertEquals(parser.getValue(ast , context) , 25 );

		ast = parser.parseExpression("members.?[name == 'John' OR olderThan(17)]");
		result = (List) parser.getValue(ast , context) ;
		assertEquals(result.size() , 2);
		assertTrue(result.contains(person2));
		assertTrue(result.contains(person));

		ast = parser.parseExpression("{1, 2, 3, 4, 5, 6, 7}.?[#this >= 5]");
		result = (List) parser.getValue(ast , context);
		assertEquals(result.size() , 3);
	}

	@Test
	public void testMapSelection() {
		AmlDslInterpreter parser = new AmlDslInterpreter();
		Person person = new Person("John", 25);
		Person person2 = new Person("Mike", 30);
		Person friend = new Person("Mike's friend" , 10);

		person.addToDict("person1" , person);
		person.addToDict("person2", person2);
		person.addToDict("friend" , friend);
		EvaluationContext context = new EvaluationContext();
		context.addVariable("map" , person.dict);

		ParseTree ast = parser.parseExpression("map.?[value.age < 17]");
		Map result = (Map) parser.getValue(ast , context) ;
		assertEquals(result.size() , 1);
		assertTrue(result.containsValue(friend));

		ast = parser.parseExpression("map.?[value.age <= 27].size()");
		assertEquals(parser.getValue(ast , context) , 2 );

		ast = parser.parseExpression("map.?[value.olderThan(15)]");
		result = (Map) parser.getValue(ast , context) ;
		assertEquals(result.size() , 2);
		assertTrue(result.containsValue(person));
		assertTrue(result.containsValue(person2));

		ast = parser.parseExpression("map.?[value.olderThan(15)]['person1']");
		assertTrue(parser.getValue(ast , context) instanceof Person  );

		ast = parser.parseExpression("map.?[key == 'friend']");
		result = (Map) parser.getValue(ast , context) ;
		assertEquals(result.size() , 1);
		assertTrue(result.containsValue(friend));
	}

}
