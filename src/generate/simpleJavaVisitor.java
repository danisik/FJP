// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBody(SimpleJavaParser.ExpressionBodyContext ctx);
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