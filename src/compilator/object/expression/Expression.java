package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EVariableType;

public class Expression {

    private EExpressionType type;
    private EVariableType expectedReturnType;

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


    public EVariableType getExpectedReturnType()
    {
        return expectedReturnType;
    }

    public void setExpectedReturnType(EVariableType expectedReturnType)
    {
        this.expectedReturnType = expectedReturnType;
    }
}
