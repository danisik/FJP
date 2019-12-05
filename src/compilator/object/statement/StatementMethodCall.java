package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.MethodCall;

public class StatementMethodCall extends Statement
{
    private MethodCall methodCall;

    public StatementMethodCall(MethodCall methodCall)
    {
        super(StatementType.METHOD_CALL);
        this.methodCall = methodCall;
    }

    public MethodCall getMethodCall()
    {
        return methodCall;
    }

    public void setMethodCall(MethodCall methodCall)
    {
        this.methodCall = methodCall;
    }
}
