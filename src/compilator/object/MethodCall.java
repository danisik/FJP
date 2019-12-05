package compilator.object;

import compilator.enums.MethodReturnType;

public class MethodCall
{

    private final String identifier;
    private MethodReturnType expectedReturnType;

    public MethodCall(String identifier)
    {
        this.identifier = identifier;
    }

    public MethodCall(String identifier, MethodReturnType expectedReturnType)
    {
        this.identifier = identifier;
        this.expectedReturnType = expectedReturnType;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public MethodReturnType getExpectedReturnType()
    {
        return expectedReturnType;
    }

    public void setExpectedReturnType(MethodReturnType expectedReturnType)
    {
        this.expectedReturnType = expectedReturnType;
    }
}
