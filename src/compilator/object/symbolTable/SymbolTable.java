package compilator.object.symbolTable;

import java.util.HashMap;

public class SymbolTable
{
    private static final SymbolTable instance = new SymbolTable();

    private static HashMap<String, SymbolTableItem> table = new HashMap<>();

    public static SymbolTable getInstance()
    {
        return instance;
    }

    public HashMap<String, SymbolTableItem> getTable()
    {
        return table;
    }

    public void addItem(SymbolTableItem symbolTableItem)
    {
        table.put(symbolTableItem.getName(), symbolTableItem);
    }
}
