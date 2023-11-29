package com.example.parser.controller;

import com.example.parser.interpreter.AmlDslInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class Controller {
    @GetMapping("/get")
    public String getHello(){
        return "Hello";
    }

    @PostMapping("/parse")
    public String parseExpression(@RequestBody Dto dto){
        AmlDslInterpreter parser = new AmlDslInterpreter();
        ParseTree ast = parser.parseExpression(dto.expression);

        BigDecimal a = (BigDecimal) parser.getValue(ast);
        return a.toString();
    }
}
