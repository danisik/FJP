package compilator.object.instruction;

import compilator.enums.EInstruction;

public class Instruction
{
    private EInstruction instruction;
    private int rowId;
    private int level;
    private int address;

    public Instruction(EInstruction instruction, int rowId, int level, int address)
    {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.address = address;
    }

    @Override
    public String toString()
    {
        return this.rowId + " " + this.instruction + " " + this.level + " " + this.address;
    }

    public EInstruction getInstruction()
    {
        return instruction;
    }

    public void setInstruction(EInstruction instruction)
    {
        this.instruction = instruction;
    }

    public int getRowId()
    {
        return rowId;
    }

    public void setRowId(int rowId)
    {
        this.rowId = rowId;
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
}
