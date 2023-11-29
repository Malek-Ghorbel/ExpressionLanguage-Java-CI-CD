package com.example.parser.interpreter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AmlDslEvaluator extends AmlDslBaseVisitor<Object> {
    private static final Logger LOGGER = EvaluatorLogger.getLogger();
    private final EvaluationContext context;

    public AmlDslEvaluator() {
        this.context = new EvaluationContext() ;
    }
    public AmlDslEvaluator(EvaluationContext evaluationContext) {
        this.context = evaluationContext ;
    }

    public Object getValue(ParseTree tree){
        return this.visit(tree);
    }

    @Override
    public Object visitStart(AmlDslParser.StartContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitProperty(AmlDslParser.PropertyContext ctx) {
        if (ctx.STRING() != null) {
            String s =  ctx.STRING().getText();
            return s.substring(1, s.length() - 1);
        }
        else {
            Object root = context.getRootObject();
            try {
                if (root == null) {
                    String key = ctx.IDENTIFIER(0).getText();
                    List<TerminalNode> properties = ctx.IDENTIFIER().subList(1, ctx.IDENTIFIER().size());
                    Object object = context.lookupVariable(key);
                    return PropertyAccessor.getProperty(properties, object);
                }
                else {
                    return PropertyAccessor.getProperty(ctx.IDENTIFIER(), root);
                }
            }
            catch (NoSuchFieldException | IllegalAccessException e) {
                LOGGER.log(Level.SEVERE, "field doesn't exist", e);
            }
            return null;
        }
    }

    @Override
    public Object visitThis(AmlDslParser.ThisContext ctx) {
        return context.getRootObject() ;
    }

    @Override
    public Object visitCalcPlus(AmlDslParser.CalcPlusContext ctx) {
        Object left = visit(ctx.calc(0));
        Object right = visit(ctx.calc(1));
        if (left instanceof String || right instanceof String) {
            String leftOperand = left.toString() ;
            String rightOperand = right.toString() ;
            return  leftOperand + rightOperand ;
        }
        else {
            BigDecimal leftOperand = new BigDecimal(left.toString()) ;
            BigDecimal rightOperand = new BigDecimal(right.toString()) ;
            return leftOperand.add(rightOperand)  ;
        }

    }

    @Override
    public Object visitCalcMinus(AmlDslParser.CalcMinusContext ctx) {
        BigDecimal left = (BigDecimal) visit(ctx.calc(0));
        BigDecimal right = (BigDecimal) visit(ctx.calc(1));
        return left.subtract(right)  ;
    }

    @Override
    public Object visitCalcDivision(AmlDslParser.CalcDivisionContext ctx) {
        BigDecimal left = (BigDecimal) visit(ctx.calc(0));
        BigDecimal right = (BigDecimal) visit(ctx.calc(1));
        return left.divide(right,20, RoundingMode.HALF_UP)  ;
    }

    @Override
    public Object visitCalcMultiplication(AmlDslParser.CalcMultiplicationContext ctx) {
        BigDecimal left = (BigDecimal) visit(ctx.calc(0));
        BigDecimal right = (BigDecimal) visit(ctx.calc(1));
        return left.multiply(right)  ;
    }

    @Override
    public Object visitCalcModulo(AmlDslParser.CalcModuloContext ctx) {
        BigDecimal left = (BigDecimal) visit(ctx.calc(0));
        BigDecimal right = (BigDecimal) visit(ctx.calc(1));
        return left.remainder(right)  ;
    }


    @Override
    public Object visitUnaryExpr(AmlDslParser.UnaryExprContext ctx) {
        return visit(ctx.unary());
    }

    @Override
    public Object visitMemberExpr(AmlDslParser.MemberExprContext ctx) {
        return  visit(ctx.member()) ;
    }

    @Override
    public Object visitNegate(AmlDslParser.NegateContext ctx) {
        BigDecimal result = (BigDecimal) visit(ctx.member()) ;
        return result.negate() ;
    }

    @Override
    public Object visitNested(AmlDslParser.NestedContext ctx) {
        return visit(ctx.calc());
    }

    @Override
    public Object visitConstantLiteral(AmlDslParser.ConstantLiteralContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Object visitLiteral(AmlDslParser.LiteralContext ctx) {
        if (ctx.INT() != null)
            return new BigDecimal(ctx.INT().getText());
        else
            return new BigDecimal(ctx.FLOAT().getText());
    }

    @Override
    public Object visitCompExpr(AmlDslParser.CompExprContext ctx) {
        Boolean left =(Boolean) visit(ctx.logical(0));
        Boolean right = (Boolean) visit(ctx.logical(1));
        return switch (ctx.op.getText()) {
            case "==", "eq" -> (left.equals(right));
            default -> (!Objects.equals(left, right));
        };
    }

    @Override
    public Object visitAndExpr(AmlDslParser.AndExprContext ctx) {
        boolean left = (boolean) visit(ctx.logical());
        boolean right = (boolean) visit(ctx.expr());
        return (left && right);
    }

    @Override
    public Object visitUnaryLogExpr(AmlDslParser.UnaryLogExprContext ctx) {
        return visit(ctx.unaryLog());
    }

    @Override
    public Object visitOrExpr(AmlDslParser.OrExprContext ctx) {
        boolean left = (boolean) visit(ctx.logical());
        boolean right = (boolean) visit(ctx.expr());
        return (left || right);
    }

    @Override
    public Object visitLogMember(AmlDslParser.LogMemberContext ctx) {
        return visit(ctx.memberLog());
    }

    @Override
    public Object visitLogicalNot(AmlDslParser.LogicalNotContext ctx) {
        return  !((boolean) visit(ctx.memberLog()));
    }

    @Override
    public Object visitNestedLog(AmlDslParser.NestedLogContext ctx) {
        return visit(ctx.logical());
    }

    @Override
    public Object visitRelationExpr(AmlDslParser.RelationExprContext ctx) {
        return visit(ctx.relation());
    }

    @Override
    public Object visitLogConstant(AmlDslParser.LogConstantContext ctx) {
        if (ctx.TRUE() != null) return Boolean.parseBoolean(ctx.TRUE().getText());
        else return Boolean.parseBoolean(ctx.FALSE().getText());
    }

    @Override
    public Object visitRelation(AmlDslParser.RelationContext ctx) {
        Object l = visit(ctx.calc(0)) ;
        Object r = visit(ctx.calc(1))  ;
        boolean  a = false ;
        switch (ctx.op.getText()) {
            case "==", "eq" -> {
                a= (l.equals(r)) ;
                return  a ;
            }
            case "!=", "ne" -> {
                a = (!Objects.equals(l, r)) ;
                return a ;
            }
        }
        BigDecimal left = new BigDecimal(l.toString()) ;
        BigDecimal right = new BigDecimal(r.toString())  ;
        switch (ctx.op.getText()) {
            case ">" , "gt" -> a = (left.compareTo(right) > 0);
            case ">=" , "ge" -> a = (left.compareTo(right) >= 0);
            case "<" , "lt" -> a = (left.compareTo(right) < 0);
            case "<=" , "le" -> a = (left.compareTo(right) <= 0);
        }
        return a;
    }

    @Override
    public Object visitMethodCall(AmlDslParser.MethodCallContext ctx) {
        return visit(ctx.method());
    }

    @Override
    public Object visitObjectMethod(AmlDslParser.ObjectMethodContext ctx) {
        Object object;
        if (ctx.object() != null) {
            object = visit(ctx.object());
        }
        else if (ctx.list() != null) {
            object = visit(ctx.list()) ;
        }
        else {
            object = context.getRootObject();
        }
        if (ctx.selection() != null) {
            object = applySelection(object , ctx.selection()) ;
        }
        for(int i =0 ; i<ctx.IDENTIFIER().size() ; i++) {
            String method = ctx.IDENTIFIER(i).getText() ;
            List<Object> arguments = (List<Object>) visit(ctx.arguments(i)) ;
            if (arguments != null) {
                try {
                    object = PropertyAccessor.invokeMethod(object , method, arguments) ;
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "method doesn't exist", e);
                }
            }
            else {
                try {
                    object = PropertyAccessor.invokeMethod(object , method) ;
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "method doesn't exist", e);
                }
            }
        }
        return object;
    }

    @Override
    public Object visitArgumentsExpr(AmlDslParser.ArgumentsExprContext ctx) {
        List<Object> arguments = new ArrayList<>();
        for(AmlDslParser.ExprContext expr : ctx.expr()) {
            Object argument = visit(expr);
            if (argument instanceof BigDecimal) {
                argument = ConversionHelper.convertBigDecimal((BigDecimal) argument);
            }
            arguments.add(argument);
        }
        return arguments;
    }

    @Override public Object visitNoArguments(AmlDslParser.NoArgumentsContext ctx) {
        return null;
    }

    @Override
    public Object visitRegistredMethod(AmlDslParser.RegistredMethodContext ctx) {
        Object object = null ;
        Method method = (Method)  context.getFunction(ctx.IDENTIFIER(0).getText());
        List<Object> arguments =  (List<Object>) visit(ctx.arguments(0));
        if (arguments != null) {
            try {
                object = method.invoke(null, arguments.toArray());
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "method doesn't exist", e);
            }
        }
        for(int i =1 ; i<ctx.IDENTIFIER().size() ; i++) {
            String methods = ctx.IDENTIFIER(i).getText() ;
            List<Object> argument = (List<Object>) visit(ctx.arguments(i)) ;
            if (argument != null) {
                try {
                    object = PropertyAccessor.invokeMethod(object , methods, argument) ;
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "method doesn't exist", e);
                }
            }
            else {
                try {
                    assert object != null;
                    object = PropertyAccessor.invokeMethod(object, methods) ;
                } catch (Exception e) {
                    LOGGER.log(Level.SEVERE, "method doesn't exist", e);
                }
            }
        }
        return object;
    }

    @Override
    public Object visitListAccess(AmlDslParser.ListAccessContext ctx) {
        Object root = context.getRootObject() ;
        Object object = null ;
        try {
            if (ctx.list() == null) {
                object = visit(ctx.property());
            }
            else {
                object = visit(ctx.list());
            }
            if (ctx.selection() != null) {
                object = applySelection(object , ctx.selection()) ;
            }
            for(int i=0 ; i<ctx.expr().size() ; i++) {
                Object index = visit(ctx.expr(i)) ;
                if (object instanceof List<?> list) {
                    Integer j ;
                    if (index instanceof BigDecimal bg) {
                        j = bg.intValue();
                    }
                    else {
                        j = (Integer) index ;
                    }
                    object = list.get((int) j);
                }
                else if (object instanceof Map<?,?> map) {
                    object =  map.get(index) ;
                }
            }

            if (ctx.IDENTIFIER().size() >= 1) {
                return PropertyAccessor.getProperty(ctx.IDENTIFIER() , object) ;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.log(Level.SEVERE, "field doesn't exist", e);
        }
        return object ;
    }

    @Override
    public Object visitList(AmlDslParser.ListContext ctx) {
        List<Object> res = new ArrayList<>() ;
        for (int i=0 ; i<ctx.expr().size() ; i++) {
            res.add(visit(ctx.expr(i))) ;
        }
        return res ;
    }

    private Object applySelection(Object collection , AmlDslParser.SelectionContext selection) {
        if (collection instanceof List<?> list) {
            List<Object> result = new ArrayList<>() ;
            Object oldRoot = context.getRootObject() ;
            for (Object element : list) {
                context.setRootObject(element);
                Boolean condition = (Boolean) visit(selection.expr()) ;
                if (condition) result.add(element) ;
            }
            context.setRootObject(oldRoot);
            return result ;
        }
        if (collection instanceof Map<?,?> map) {
            Object oldRoot = context.getRootObject() ;
            Map<Object , Object> res = new HashMap<>() ;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                context.setRootObject(entry);
                Boolean cond = (Boolean) visit(selection.expr()) ;
                if (cond) res.put(entry.getKey() , entry.getValue()) ;
            }
            context.setRootObject(oldRoot);
            return res ;
        }
        return null ;
    }

    @Override
    public Object visitSelectionExpr(AmlDslParser.SelectionExprContext ctx) {
        Object collection = null ;
        if (ctx.list() != null) collection = visit(ctx.list()) ;
        else if (ctx.method() != null) collection = visit(ctx.method()) ;
        else if (ctx.object() != null) collection = visit(ctx.object()) ;
        return applySelection(collection , ctx.selection()) ;
    }

}
