package compilator.object.statement;

import compilator.object.BlockStatement;
import compilator.object.Body;

public class StatementSwitchBlock
{

    private int identifier;
    private final BlockStatement body;
    private boolean isSetDefault = false;

    public StatementSwitchBlock(BlockStatement body)
    {
        this.body = body;
    }

    public StatementSwitchBlock(int identifier, BlockStatement body)
    {
        this.identifier = identifier;
        this.body = body;
    }

    public int getIdentifier()
    {
        return identifier;
    }

    public BlockStatement getBody()
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
