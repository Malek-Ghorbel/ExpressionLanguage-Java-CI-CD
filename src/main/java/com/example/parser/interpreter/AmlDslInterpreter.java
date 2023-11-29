package com.example.parser.interpreter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * to use the interpreter just create an instance of this class with the expression as parameter
 * AmlDslInterpreter interpreter = new AmlDslInterpreter("2*2.5 +5");
 * BigDecimal result = interpreter.getValue(); // result is 10
 */
public class AmlDslInterpreter extends AmlDslBaseVisitor<Object> {

	public AmlDslInterpreter(){
    }
	
    public ParseTree parseExpression(String input) {
        CharStream inputStream = CharStreams.fromString(input) ;
        AmlDslLexer lexer = new AmlDslLexer(inputStream) ;
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AmlDslParser parser = new AmlDslParser(tokenStream);
        return parser.start();
    }

    public Object getValue(ParseTree tree){
        AmlDslEvaluator evaluator = new AmlDslEvaluator();
        return evaluator.getValue(tree);
    }
    
    public Object getValue(ParseTree tree, Object rootObject){
        EvaluationContext context = new EvaluationContext(rootObject);
        AmlDslEvaluator evaluator = new AmlDslEvaluator(context) ;
        return evaluator.getValue(tree);
    }
    
    public Object getValue(ParseTree tree, EvaluationContext evaluationContext){
        AmlDslEvaluator evaluator = new AmlDslEvaluator(evaluationContext) ;
        return evaluator.getValue(tree);
    }
}