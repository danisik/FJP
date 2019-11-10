// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleJavaParser}.
 */
public interface SimpleJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void enterMethodReturnType(SimpleJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodReturnType}.
	 * @param ctx the parse tree
	 */
	void exitMethodReturnType(SimpleJavaParser.MethodReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void enterPossibleValues(SimpleJavaParser.PossibleValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#possibleValues}.
	 * @param ctx the parse tree
	 */
	void exitPossibleValues(SimpleJavaParser.PossibleValuesContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void enterDecimalValue(SimpleJavaParser.DecimalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#decimalValue}.
	 * @param ctx the parse tree
	 */
	void exitDecimalValue(SimpleJavaParser.DecimalValueContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(SimpleJavaParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(SimpleJavaParser.BoolValueContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstVariableDeclaration(SimpleJavaParser.ConstVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#constVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstVariableDeclaration(SimpleJavaParser.ConstVariableDeclarationContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallParameter(SimpleJavaParser.MethodCallParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#methodCallParameter}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallParameter(SimpleJavaParser.MethodCallParameterContext ctx);
}