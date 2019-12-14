package compilator.object.control;

import compilator.object.expression.Expression;

public class ControlFor
{

    private final String identifier;
    private Expression expression;
    private Expression to;

    public ControlFor(String identifier, Expression expression, Expression to)
    {

        this.identifier = identifier;
        this.expression = expression;
        this.to = to;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Expression getFrom()
    {
        return expression;
    }

    public Expression getTo()
    {
        return to;
    }
}
