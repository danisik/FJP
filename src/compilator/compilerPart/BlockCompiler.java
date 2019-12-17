package compilator.compilerPart;

import compilator.object.Block;
import compilator.object.method.Method;
import compilator.object.method.MethodPrototype;
import compilator.object.symbolTable.SymbolTableItem;

import java.util.List;
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
        this.generateMethodsPrototype();

        new BlockStatementCompiler(this.block.getBlockStatement(), 0).run();

        for(Map.Entry<String, SymbolTableItem> entry : this.getSymbolTable().getTable().entrySet()) {
            String key = entry.getKey();
            SymbolTableItem value = entry.getValue();

            System.out.println(value);
        }
    }

    private void generateMethodsPrototype()
    {
        List<Method> methods = this.block.getBlockStatement().getMethods();
        for(Method method : methods)
        {
            MethodPrototype prototype = new MethodPrototype(method.getIdentifier(), method.getReturnType());
            this.getMethodPrototypes().put(prototype.getName(), prototype);
        }
    }
}
