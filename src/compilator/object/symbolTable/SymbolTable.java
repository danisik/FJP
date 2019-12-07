package compilator.object.symbolTable;

import java.util.HashMap;

public class SymbolTable
{
    private HashMap<String, SymbolTableItem> table = new HashMap<>();

    public HashMap<String, SymbolTableItem> getTable()
    {
        return table;
    }

    public void addItem(SymbolTableItem symbolTableItem)
    {
        this.table.put(symbolTableItem.getName(), symbolTableItem);
    }

    public SymbolTableItem getItem(String identifier)
    {
        return this.table.get(identifier);
    }
}
