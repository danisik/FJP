package compilator.compilerPart;

import compilator.object.Block;

public class BlockCompiler extends BaseCompiler
{
    private Block block;

    public BlockCompiler(Block block)
    {
        this.block = block;
    }

    public void run()
    {
        new BlockStatementCompiler(this.block.getBlockStatement(), 0).run();
    }
}
