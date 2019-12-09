package compilator.object.expression;

import compilator.enums.EExpressionType;

public class Expression {

    private EExpressionType type;

    public Expression(EExpressionType type)
    {
        this.type = type;
    }

    public EExpressionType getType()
    {
        return type;
    }

    public void setType(EExpressionType type)
    {
        this.type = type;
    }
}
