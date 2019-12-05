package compilator.object;

import compilator.enums.EMethodReturnType;

public class MethodCall
{

    private final String identifier;
    private EMethodReturnType expectedReturnType;

    public MethodCall(String identifier)
    {
        this.identifier = identifier;
    }

    public MethodCall(String identifier, EMethodReturnType expectedReturnType)
    {
        this.identifier = identifier;
        this.expectedReturnType = expectedReturnType;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public EMethodReturnType getExpectedReturnType()
    {
        return expectedReturnType;
    }

    public void setExpectedReturnType(EMethodReturnType expectedReturnType)
    {
        this.expectedReturnType = expectedReturnType;
    }
}
