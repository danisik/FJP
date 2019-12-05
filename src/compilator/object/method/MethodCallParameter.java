package compilator.object.method;

import compilator.object.expression.Expression;

public class MethodCallParameter
{
    private Expression expression;

    public MethodCallParameter(Expression expression)
    {
        this.expression = expression;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
