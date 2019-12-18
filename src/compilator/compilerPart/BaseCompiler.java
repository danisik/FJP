package compilator.compilerPart;

import compilator.ErrorHandler;
import compilator.enums.EInstruction;
import compilator.object.instruction.Instruction;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodPrototype;
import compilator.object.symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;

public class BaseCompiler
{
    protected static ArrayList<Instruction> instructionsList = new ArrayList<>();

    protected static SymbolTable symbolTable = new SymbolTable();

    private static int instructionsCounter = 0;

    protected final int BASE_METHOD_SIZE = 3;

    private static int stackPointer = 3;

    public final int STACK_POINTER_DEFAULT_VALUE = 3;

    private static HashMap<String, MethodPrototype> methodPrototype = new HashMap<>();

    public ArrayList<Instruction> getInstructionsList()
    {
        return instructionsList;
    }

    protected static ErrorHandler errorHandler = ErrorHandler.getInstance();

    protected void addInstruction(EInstruction instruction, int level, int address)
    {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, address));
        instructionsCounter++;
    }

    protected void addMethodCallInstruction(EInstruction instruction, int level, MethodCall methodCall)
    {
        instructionsList.add(new Instruction(instruction, this.getInstructionsCounter(), level, methodCall));
        instructionsCounter++;
    }

    protected int getStackPointer()
    {
        return stackPointer;
    }
    protected void setStackPointer(int address)
    {
        stackPointer = address;
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

    protected boolean isInSymbolTable(String identifier)
    {
        return this.getSymbolTable().getTable().containsKey(identifier);
    }

    protected ErrorHandler getErrorHandler()
    {
        return errorHandler;
    }

    public HashMap<String, MethodPrototype> getMethodPrototype()
    {
        return methodPrototype;
    }

    public HashMap<String, MethodPrototype> getMethodPrototypes()
    {
        return methodPrototype;
    }
}
