package compilator.object;

public class Block {

    private BlockStatement blockStatement;

    public Block(BlockStatement blockStatement)
    {

        this.blockStatement = blockStatement;
    }

    public BlockStatement getBlockStatement()
    {
        return blockStatement;
    }
}
