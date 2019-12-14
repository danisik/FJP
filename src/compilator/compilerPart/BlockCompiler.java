package compilator.compilerPart;

import compilator.object.Block;
import compilator.object.symbolTable.SymbolTableItem;

import java.util.Map;

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

        for(Map.Entry<String, SymbolTableItem> entry : this.getSymbolTable().getTable().entrySet()) {
            String key = entry.getKey();
            SymbolTableItem value = entry.getValue();

            System.out.println(value);
        }
    }
}
