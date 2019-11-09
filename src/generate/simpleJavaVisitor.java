// Generated from /Users/cagy/Documents/Škola/FJP/FJP/src/SimpleJava.g4 by ANTLR 4.7.2
package generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(simpleJavaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#decimalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalVariable(simpleJavaParser.DecimalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(simpleJavaParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(simpleJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(simpleJavaParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(simpleJavaParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#paralelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalelDeclaration(simpleJavaParser.ParalelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(simpleJavaParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(simpleJavaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(simpleJavaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(simpleJavaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBody(simpleJavaParser.ExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(simpleJavaParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#switchBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatement(simpleJavaParser.SwitchBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(simpleJavaParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(simpleJavaParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(simpleJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleJavaParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(simpleJavaParser.MethodCallContext ctx);
}