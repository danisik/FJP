package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.object.method.MethodCall;

public class ExpressionMethodCall extends Expression
{
    private MethodCall methodCall;

    public ExpressionMethodCall(MethodCall methodCall)
    {
        super(EExpressionType.METHOD_CALL);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall()
    {
        return methodCall;
    }
}
