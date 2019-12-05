package compilator.object.symbolTable;

import compilator.object.Variable;

public class SymbolTableItem
{

    private String name;
    private int level;
    private int address;
    private int size;
    private boolean isMethod = false;
    private boolean isVariable = false;
    private Variable variable;

    public SymbolTableItem(String name, int level, int address, int size)
    {
        this.name = name;
        this.level = level;
        this.address = address;
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "SymbolTableItem{" +
                "name='" + name +
                ", level=" + level +
                ", address=" + address +
                ", size=" + size +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getAddress()
    {
        return address;
    }

    public void setAddress(int address)
    {
        this.address = address;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public boolean isVariable()
    {
        return isVariable;
    }

    public void setVariable(boolean variable)
    {
        isVariable = variable;
    }

    public boolean isMethod()
    {
        return isMethod;
    }

    public void setMethod(boolean method)
    {
        isMethod = method;
    }
}
