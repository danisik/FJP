package compilator.object.symbolTable;

public class SymbolTableItem
{

    private String name;
    private int level;
    private int address;
    private int size;

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
}
