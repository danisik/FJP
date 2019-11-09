// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleJavaParser}.
 */
public interface simpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(simpleJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(simpleJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void enterDecimalVariable(simpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void exitDecimalVariable(simpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(simpleJavaParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(simpleJavaParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(simpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(simpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(simpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(simpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(simpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(simpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParalelDeclaration(simpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParalelDeclaration(simpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(simpleJavaParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(simpleJavaParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(simpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(simpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(simpleJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(simpleJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(simpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(simpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBody(simpleJavaParser.ExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBody(simpleJavaParser.ExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(simpleJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(simpleJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatement(simpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatement(simpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(simpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(simpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(simpleJavaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(simpleJavaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(simpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(simpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(simpleJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(simpleJavaParser.MethodCallContext ctx);
}