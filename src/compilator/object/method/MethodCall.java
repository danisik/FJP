package compilator.object.method;

import compilator.enums.EMethodReturnType;

import java.util.List;

public class MethodCall
{

    private final String identifier;
    private List<MethodCallParameter> parameters;
    private EMethodReturnType expectedReturnType;

    public MethodCall(String identifier)
    {
        this.identifier = identifier;
    }

    public MethodCall(String identifier, List<MethodCallParameter> parameters)
    {
        this.identifier = identifier;
        this.parameters = parameters;
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

    public List<MethodCallParameter> getParameters()
    {
        return parameters;
    }
}
