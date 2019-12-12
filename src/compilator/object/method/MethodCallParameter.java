package compilator.object.method;

import compilator.enums.EVariableType;
import compilator.object.expression.Expression;

public class MethodCallParameter
{
    private Expression expression;
    private EVariableType variableType;

    public MethodCallParameter(Expression expression, EVariableType variableType)
    {
        this.expression = expression;
        this.variableType = variableType;
    }

    public Expression getExpression()
    {
        return expression;
    }

    public EVariableType getVariableType()
    {
        return variableType;
    }
}
