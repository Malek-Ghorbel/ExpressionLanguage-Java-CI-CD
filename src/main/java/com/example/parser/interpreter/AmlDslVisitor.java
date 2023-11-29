package com.example.parser.interpreter;
// Generated from AmlDsl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmlDslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmlDslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AmlDslParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AmlDslParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(AmlDslParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AmlDslParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(AmlDslParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListInitExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInitExpr(AmlDslParser.ListInitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectionExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionExpr(AmlDslParser.SelectionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(AmlDslParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(AmlDslParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectMethod(AmlDslParser.ObjectMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegistredMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistredMethod(AmlDslParser.RegistredMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(AmlDslParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAccess(AmlDslParser.ListAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisObject}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisObject(AmlDslParser.ThisObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#this}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(AmlDslParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AmlDslParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpr}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpr(AmlDslParser.ArgumentsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoArguments}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoArguments(AmlDslParser.NoArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(AmlDslParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryLogExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLogExpr(AmlDslParser.UnaryLogExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(AmlDslParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(AmlDslParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogMember}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogMember(AmlDslParser.LogMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalNot}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(AmlDslParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedLog}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedLog(AmlDslParser.NestedLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationExpr}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(AmlDslParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogConstant}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogConstant(AmlDslParser.LogConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(AmlDslParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcPlus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcPlus(AmlDslParser.CalcPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcMinus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcMinus(AmlDslParser.CalcMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcDivision}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcDivision(AmlDslParser.CalcDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcModulo}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcModulo(AmlDslParser.CalcModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CalcMultiplication}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcMultiplication(AmlDslParser.CalcMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AmlDslParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(AmlDslParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(AmlDslParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nested}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(AmlDslParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantLiteral}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantLiteral(AmlDslParser.ConstantLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AmlDslParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmlDslParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AmlDslParser.LiteralContext ctx);
}