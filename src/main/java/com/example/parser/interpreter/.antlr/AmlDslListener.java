// Generated from /home/malik/Downloads/az/ExpressionLanguage-Java-CI-CD/src/main/java/com/example/parser/interpreter/AmlDsl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmlDslParser}.
 */
public interface AmlDslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AmlDslParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AmlDslParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AmlDslParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AmlDslParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(AmlDslParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(AmlDslParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AmlDslParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AmlDslParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(AmlDslParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(AmlDslParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListInitExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListInitExpr(AmlDslParser.ListInitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListInitExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListInitExpr(AmlDslParser.ListInitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectionExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelectionExpr(AmlDslParser.SelectionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectionExpr}
	 * labeled alternative in {@link AmlDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelectionExpr(AmlDslParser.SelectionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(AmlDslParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(AmlDslParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(AmlDslParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(AmlDslParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 */
	void enterObjectMethod(AmlDslParser.ObjectMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 */
	void exitObjectMethod(AmlDslParser.ObjectMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegistredMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 */
	void enterRegistredMethod(AmlDslParser.RegistredMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegistredMethod}
	 * labeled alternative in {@link AmlDslParser#method}.
	 * @param ctx the parse tree
	 */
	void exitRegistredMethod(AmlDslParser.RegistredMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(AmlDslParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(AmlDslParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void enterListAccess(AmlDslParser.ListAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAccess}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void exitListAccess(AmlDslParser.ListAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisObject}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void enterThisObject(AmlDslParser.ThisObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisObject}
	 * labeled alternative in {@link AmlDslParser#object}.
	 * @param ctx the parse tree
	 */
	void exitThisObject(AmlDslParser.ThisObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#this}.
	 * @param ctx the parse tree
	 */
	void enterThis(AmlDslParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#this}.
	 * @param ctx the parse tree
	 */
	void exitThis(AmlDslParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AmlDslParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AmlDslParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpr}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpr(AmlDslParser.ArgumentsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpr}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpr(AmlDslParser.ArgumentsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoArguments}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterNoArguments(AmlDslParser.NoArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoArguments}
	 * labeled alternative in {@link AmlDslParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitNoArguments(AmlDslParser.NoArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(AmlDslParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(AmlDslParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryLogExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLogExpr(AmlDslParser.UnaryLogExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryLogExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLogExpr(AmlDslParser.UnaryLogExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(AmlDslParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(AmlDslParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(AmlDslParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link AmlDslParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(AmlDslParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogMember}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 */
	void enterLogMember(AmlDslParser.LogMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogMember}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 */
	void exitLogMember(AmlDslParser.LogMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalNot}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(AmlDslParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalNot}
	 * labeled alternative in {@link AmlDslParser#unaryLog}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(AmlDslParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedLog}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void enterNestedLog(AmlDslParser.NestedLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedLog}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void exitNestedLog(AmlDslParser.NestedLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationExpr}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(AmlDslParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationExpr}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(AmlDslParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogConstant}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void enterLogConstant(AmlDslParser.LogConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogConstant}
	 * labeled alternative in {@link AmlDslParser#memberLog}.
	 * @param ctx the parse tree
	 */
	void exitLogConstant(AmlDslParser.LogConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(AmlDslParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(AmlDslParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcPlus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcPlus(AmlDslParser.CalcPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcPlus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcPlus(AmlDslParser.CalcPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcMinus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcMinus(AmlDslParser.CalcMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcMinus}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcMinus(AmlDslParser.CalcMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcDivision}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcDivision(AmlDslParser.CalcDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcDivision}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcDivision(AmlDslParser.CalcDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcModulo}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcModulo(AmlDslParser.CalcModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcModulo}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcModulo(AmlDslParser.CalcModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CalcMultiplication}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalcMultiplication(AmlDslParser.CalcMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CalcMultiplication}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalcMultiplication(AmlDslParser.CalcMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AmlDslParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link AmlDslParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AmlDslParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(AmlDslParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(AmlDslParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterNegate(AmlDslParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link AmlDslParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitNegate(AmlDslParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nested}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void enterNested(AmlDslParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nested}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void exitNested(AmlDslParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantLiteral}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void enterConstantLiteral(AmlDslParser.ConstantLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantLiteral}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void exitConstantLiteral(AmlDslParser.ConstantLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AmlDslParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link AmlDslParser#member}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AmlDslParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmlDslParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AmlDslParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmlDslParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AmlDslParser.LiteralContext ctx);
}