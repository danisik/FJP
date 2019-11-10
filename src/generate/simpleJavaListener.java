// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SimpleJavaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SimpleJavaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void enterDecimalVariable(SimpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 */
	void exitDecimalVariable(SimpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(SimpleJavaParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(SimpleJavaParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(SimpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(SimpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(SimpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParalelDeclaration(SimpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParalelDeclaration(SimpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(SimpleJavaParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(SimpleJavaParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SimpleJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBody(SimpleJavaParser.ExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBody(SimpleJavaParser.ExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(SimpleJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatement(SimpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatement(SimpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameter(SimpleJavaParser.MethodParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameter(SimpleJavaParser.MethodParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SimpleJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SimpleJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SimpleJavaParser.MethodCallContext ctx);
}