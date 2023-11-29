package com.example.parser.interpreter;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EvaluationContext {
    private Object rootObject ;
    private final Map<String, Object> variables = new ConcurrentHashMap<>();
    private final Map<String, Method> functions = new ConcurrentHashMap<>();

    public EvaluationContext() {
        this.rootObject = null ;
    }
    public EvaluationContext(Object rootObject) {
        this.rootObject = rootObject ;
    }

    public Object getRootObject() {
        return rootObject;
    }

    public void setRootObject(Object rootObject) {
        this.rootObject = rootObject;
    }

    public void addVariable(String name,Object value) {
        if (name != null) {
            if (value != null) {
                this.variables.put(name, value);
            }
            else {
                this.variables.remove(name);
            }
        }
    }

    public Object lookupVariable(String name) {
        return this.variables.get(name);
    }

    public void registerFunction(String name ,Method function) {
        if (name != null) {
            if (function != null) {
                this.functions.put(name, function);
            }
            else {
                this.functions.remove(name);
            }
        }
    }

    public Method getFunction(String name) {
        return this.functions.get(name);
    }
}
