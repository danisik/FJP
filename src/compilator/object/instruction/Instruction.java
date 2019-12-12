package compilator.object.instruction;

import compilator.enums.EInstruction;
import compilator.object.method.MethodCall;

public class Instruction
{
    private EInstruction instruction;
    private int rowId;
    private int level;
    private int address;

    private boolean laterInitialization = false;
    private MethodCall methodCall = null;

    public Instruction(EInstruction instruction, int rowId, int level, int address)
    {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.address = address;
    }

    public Instruction(EInstruction instruction, int rowId, int level, MethodCall methodCall)
    {
        this.instruction = instruction;
        this.rowId = rowId;
        this.level = level;
        this.methodCall = methodCall;
        this.address = -1;
        this.laterInitialization = true;
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


    public boolean isLaterInitialization()
    {
        return laterInitialization;
    }

    public void setLaterInitialization(boolean laterInitialization)
    {
        this.laterInitialization = laterInitialization;
    }

    public MethodCall getMethodCall()
    {
        return methodCall;
    }
}
