package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.object.instruction.Instruction;
import compilator.object.symbolTable.SymbolTable;

import java.util.ArrayList;

public class BaseCompiler
{
    protected static ArrayList<Instruction> instructionsList = new ArrayList<>();

    protected static SymbolTable symbolTable = new SymbolTable();

    private static int instructionsCounter = 0;

    protected final int BASE_METHOD_SIZE = 3;

    private static int stackPointer = 3;

    public ArrayList<Instruction> getInstructionsList()
    {
        return instructionsList;
    }

    protected void addInstruction(EInstruction instruction, int level, int address)
    {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, address));
        instructionsCounter++;
    }

    protected int getStackPointer()
    {
        return stackPointer;
    }

    protected void increaseStackPointer()
    {
        stackPointer++;
    }

    protected int getAndIncreaseStackPointer()
    {
        int val = stackPointer;

        this.increaseStackPointer();

        return val;
    }

    protected int getInstructionsCounter()
    {
        return instructionsCounter;
    }

    protected SymbolTable getSymbolTable()
    {
        return symbolTable;
    }
}
