package compilator.object.statement;

import compilator.object.BlockStatement;
import compilator.object.Body;

public class StatementSwitchBlock
{

    private int identifier;
    private final BlockStatement body;
    private int line;
    private boolean isSetDefault = false;

    public StatementSwitchBlock(BlockStatement body, int line)
    {
        this.body = body;
        this.line = line;
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

    public int getLine()
    {
        return line;
    }

    public void setLine(int line)
    {
        this.line = line;
    }
}
