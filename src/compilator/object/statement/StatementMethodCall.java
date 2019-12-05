package compilator.object.statement;

import compilator.enums.StatementType;

public class StatementMethodCall extends Statement
{
    private final String identifier;

    public StatementMethodCall(String identifier)
    {
        super(StatementType.METHOD_CALL);
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }
}
