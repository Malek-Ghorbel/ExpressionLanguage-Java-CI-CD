package com.example.parser.interpreter;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;


public class PropertyAccessor {
    public static Object getPropertyValue(Object object, String propertyName) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(propertyName);
        field.setAccessible(true);
        return field.get(object);
    }

    public static Object getProperty(List<TerminalNode> propertyNames, Object obj) throws NoSuchFieldException, IllegalAccessException {
        if (propertyNames.size() == 0) {
            return obj ;
        }
        else if (propertyNames.size() == 1) {
            String name = propertyNames.get(0).getText();
            if (obj instanceof Map.Entry<?,?> entry ) {
                if (name.equals("value")) return entry.getValue() ;
                else if (name.equals("key")) return entry.getKey() ;
            }
            Field field = obj.getClass().getDeclaredField(name);
            field.setAccessible(true);
            return field.get(obj);
        } else {
            Object currentObj = getProperty(propertyNames.subList(0, propertyNames.size() - 1), obj);
            TerminalNode lastPropertyName = propertyNames.get(propertyNames.size() - 1);
            Field field = currentObj.getClass().getDeclaredField(lastPropertyName.getText());
            field.setAccessible(true);
            return field.get(currentObj);
        }
    }

    public static Object invokeMethod(Object object, String methodName) throws Exception {
        Method method = object.getClass().getMethod(methodName);
        return method.invoke(object);
    }

    public static Object invokeMethod(Object obj, String methodName, List<Object> args) throws Exception {
        Class<?>[] parameterTypes = new Class[args.size()];
        for (int i = 0; i < args.size(); i++) {
            Class<?> argClass = args.get(i).getClass();
            MethodType methodType = MethodType.methodType(argClass).unwrap();
            if (methodType.hasPrimitives()) {
                parameterTypes[i] = methodType.returnType();
            } else {
                parameterTypes[i] = argClass;
            }
        }
        Method method = obj.getClass().getMethod(methodName, parameterTypes);
        return method.invoke(obj, args.toArray());
    }
}
