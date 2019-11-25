// Generated from /Users/cagy/Documents/Škola/FJP/simplejava/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturnType(SimpleJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPossibleValues(SimpleJavaParser.PossibleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SimpleJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(SimpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SimpleJavaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(SimpleJavaParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(SimpleJavaParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(SimpleJavaParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstVariableDeclaration(SimpleJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(SimpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(SimpleJavaParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleJavaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(SimpleJavaParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFor(SimpleJavaParser.StatementForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(SimpleJavaParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDo(SimpleJavaParser.StatementDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(SimpleJavaParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPar(SimpleJavaParser.ExprParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelational(SimpleJavaParser.ExprRelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(SimpleJavaParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultipli(SimpleJavaParser.ExprMultipliContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatement(SimpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(SimpleJavaParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SimpleJavaParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParameter(SimpleJavaParser.MethodCallParameterContext ctx);
}