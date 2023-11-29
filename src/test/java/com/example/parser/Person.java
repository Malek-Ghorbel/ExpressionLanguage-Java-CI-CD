package com.example.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

	String name;
	int age;
	static int stat = 1;
	Person friend;
	List<Integer> notes = new ArrayList<>();
	Map<String , Object> dict = new HashMap<>() ;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String sayHello() {
		return name + " hello" ;
	}
	public int sumAge(Person p) {
		return this.age + p.age;
	}

	public Boolean olderThan(int age) {
		return this.age > age ;
	}

	public void setFriend(Person friend) {
		this.friend = friend;
	}

	public void addNote(int note ) { this.notes.add(note) ;}

	public void addToDict(String key , Object value ) {dict.put(key , value) ;}

}
