package compilator.object;

public class Body
{

    private BlockStatement blockStatement;

    public Body(BlockStatement blockStatement)
    {

        this.blockStatement = blockStatement;
    }


    public BlockStatement getBlockStatement()
    {
        return blockStatement;
    }

    public void setBlockStatement(BlockStatement blockStatement)
    {
        this.blockStatement = blockStatement;
    }
}
