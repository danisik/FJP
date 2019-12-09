package compilator.compilerPart;

import compilator.enums.EExpressionType;
import compilator.enums.EVariableType;
import compilator.object.expression.*;

public class ExpressionCompiler extends BaseCompiler
{
    private final Expression expression;
    private final EVariableType resultType;

    public ExpressionCompiler(Expression expression, EVariableType resultType)
    {
        this.expression = expression;
        this.resultType = resultType;
    }

    public void run()
    {
        this.processExpression(this.expression);
    }

    private void processExpression(Expression expression)
    {
        EVariableType type = null;

        switch (this.expression.getType())
        {
            case IDENTIFIER:
                type = this.generateIdentifierInstructions((ExpressionIdentifier) expression);
                break;
            case VALUE:
                type = this.generateValueInstructions((ExpressionValue) expression);
                break;
            case MULTIPLICATION:
                type = this.generateMultiplicationInstructions((ExpressionMultiplication) expression);
                break;
            case ADDITIVE:
                type = this.generateAdditiveInstructions((ExpressionAdditive) expression);
                break;
            case RELATIONAL:
                type = this.generateRelationalInstructions((ExpressionRelational) expression);
                break;
            case LOGICAL:
                type = this.generateLogicalInstructions((ExpressionLogical) expression);
                break;
            case NEGATION:
                type = this.generateNegationInstructions((ExpressionNegation) expression);
                break;
            case PAR:
                type = this.generateParInstructions((ExpressionPar) expression);
                break;
            case METHOD_CALL:
                type = this.generateMethodCallInstructions((ExpressionMethodCall) expression);
                break;
        }

        // TODO: type check
    }

    private EVariableType generateIdentifierInstructions(ExpressionIdentifier expression)
    {
        return null;
    }

    private EVariableType generateValueInstructions(ExpressionValue expression)
    {
        return null;
    }

    private EVariableType generateMultiplicationInstructions(ExpressionMultiplication expression)
    {
        return  null;
    }

    private EVariableType generateAdditiveInstructions(ExpressionAdditive expression)
    {
        return null;
    }

    private EVariableType generateRelationalInstructions(ExpressionRelational expression)
    {
        return null;
    }

    private EVariableType generateLogicalInstructions(ExpressionLogical expression)
    {
        return null;
    }

    private EVariableType generateNegationInstructions(ExpressionNegation expression)
    {
        return null;
    }

    private EVariableType generateParInstructions(ExpressionPar expression)
    {
        return null;
    }

    private EVariableType generateMethodCallInstructions(ExpressionMethodCall expression)
    {
        return null;
    }
}
