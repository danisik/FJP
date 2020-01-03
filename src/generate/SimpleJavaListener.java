// Generated from /Users/cagy/Documents/Škola/FJP/simplejava/src/SimpleJava.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SimpleJavaParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SimpleJavaParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void enterPossibleTypes(SimpleJavaParser.PossibleTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#possibleTypes}.
	 * @param ctx the parse tree
	 */
	void exitPossibleTypes(SimpleJavaParser.PossibleTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void enterDecimalSymbol(SimpleJavaParser.DecimalSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#decimalSymbol}.
	 * @param ctx the parse tree
	 */
	void exitDecimalSymbol(SimpleJavaParser.DecimalSymbolContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssigment(SimpleJavaParser.VariableAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#variableAssigment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssigment(SimpleJavaParser.VariableAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleJavaParser.ProgramContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(SimpleJavaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(SimpleJavaParser.BodyContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleJavaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(SimpleJavaParser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleJavaParser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(SimpleJavaParser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(SimpleJavaParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementIf}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(SimpleJavaParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementFor(SimpleJavaParser.StatementForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementFor}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementFor(SimpleJavaParser.StatementForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(SimpleJavaParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementWhile}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(SimpleJavaParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDo(SimpleJavaParser.StatementDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDo}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDo(SimpleJavaParser.StatementDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSwitch}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementRepeat}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(SimpleJavaParser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementMethodCall}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(SimpleJavaParser.StatementMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssigment(SimpleJavaParser.StatementAssigmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementAssigment}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssigment(SimpleJavaParser.StatementAssigmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementVariableDeclaration(SimpleJavaParser.StatementVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementVariableDeclaration}
	 * labeled alternative in {@link SimpleJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementVariableDeclaration(SimpleJavaParser.StatementVariableDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprNeg(SimpleJavaParser.ExprNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprNeg(SimpleJavaParser.ExprNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPlus(SimpleJavaParser.ExprPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPlus(SimpleJavaParser.ExprPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAdditive}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPar(SimpleJavaParser.ExprParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPar}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPar(SimpleJavaParser.ExprParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMinus(SimpleJavaParser.ExprMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMinus(SimpleJavaParser.ExprMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprRelational(SimpleJavaParser.ExprRelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprRelational}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprRelational(SimpleJavaParser.ExprRelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIdentifier}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPossibleValue}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMethodCall(SimpleJavaParser.ExprMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMethodCall}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMethodCall(SimpleJavaParser.ExprMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(SimpleJavaParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(SimpleJavaParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void enterExprMultipli(SimpleJavaParser.ExprMultipliContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMultipli}
	 * labeled alternative in {@link SimpleJavaParser#expressionBody}.
	 * @param ctx the parse tree
	 */
	void exitExprMultipli(SimpleJavaParser.ExprMultipliContext ctx);
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