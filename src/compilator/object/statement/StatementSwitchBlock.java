package compilator.object.statement;

import compilator.object.Body;

public class StatementSwitchBlock
{

    private int identifier;
    private final Body body;
    private boolean isSetDefault = false;

    public StatementSwitchBlock(Body body)
    {
        this.body = body;
    }

    public StatementSwitchBlock(int identifier, Body body)
    {
        this.identifier = identifier;
        this.body = body;
    }

    public int getIdentifier()
    {
        return identifier;
    }

    public Body getBody()
    {
        return body;
    }

    public boolean isSetDefault()
    {
        return isSetDefault;
    }

    public void setSetDefault(boolean setDefault)
    {
        isSetDefault = setDefault;
    }
}
