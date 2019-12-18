package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.error.ErrorMethodAlreadyExists;
import compilator.error.ErrorVariableAlreadyExists;
import compilator.object.method.Method;
import compilator.object.method.MethodDeclarationParameter;
import compilator.object.symbolTable.SymbolTableItem;

import java.util.List;

public class MethodCompiler extends BaseCompiler
{
    private Method method;

    public MethodCompiler(Method method)
    {
        this.method = method;
    }

    public void run()
    {
        this.processMethod();
    }

    private void processMethod()
    {
        if (this.isInSymbolTable(this.method.getIdentifier()))
        {
            this.getErrorHandler().throwError(new ErrorMethodAlreadyExists(this.method.getIdentifier(), this.method.getLine()));
        }

        // new scope, new stack pointer
        this.setStackPointer(this.STACK_POINTER_DEFAULT_VALUE);

        // variables + parameters + default method size
        int methodCustomSize = 0;

        if (this.method.getBody() != null)
        {
            methodCustomSize = this.method.getBody().getStatementData().getVariableDeclarationCount() + this.method.getBody().getStatementData().getForStatementCount();
        }
        int methodSize = this.method.getParameters().size() + this.BASE_METHOD_SIZE + methodCustomSize;

        // add method to symbol of table, have to be added first, for get address of row to address method call
        // method address pointing at INT instruction of method
        this.addMethodToSymbolTable(methodSize);

        // load parameters from stack
        this.loadParametersToStack();


        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(this.method.getBody(), 1);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        if (this.method.getReturnValue() != null)
        {
            new ExpressionCompiler(this.method.getReturnValue(), this.method.getReturnType()).run();
            this.addInstruction(EInstruction.STO, 0, -(this.method.getParameters().size() + 1));
        }

        this.addInstruction(EInstruction.RET, 0,0);

        this.deleteParametersFromSymbolOfTable();

    }

    private void addMethodToSymbolTable(int methodSize)
    {
        SymbolTableItem symbolTableItem = new SymbolTableItem(this.method.getIdentifier(), 0, this.getInstructionsCounter(), methodSize);
        symbolTableItem.setMethod(true);
        symbolTableItem.setMethodReturnType(method.getReturnType());
        symbolTableItem.setMethodDeclarationParameters(method.getParameters());

        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(EInstruction.INT, 0, methodSize);
    }

    private void loadParametersToStack()
    {
        List<MethodDeclarationParameter> parameters = this.method.getParameters();
        SymbolTableItem item;

        for (int i = 0 ; i < parameters.size() ; i++)
        {
            if (this.isInSymbolTable(parameters.get(i).getIdentifier()))
            {
                this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(parameters.get(i).getIdentifier(), this.method.getLine()));
            }

            this.addInstruction(EInstruction.LOD, 0, i - parameters.size());

            item = new SymbolTableItem(parameters.get(i).getIdentifier(), 1, this.getAndIncreaseStackPointer(), 0);
            item.setVariableType(parameters.get(i).getType());
            this.getSymbolTable().addItem(item);

            this.addInstruction(EInstruction.STO, 0, item.getAddress());

        }
    }

    private void deleteParametersFromSymbolOfTable()
    {
        for (MethodDeclarationParameter parameter: this.method.getParameters())
        {
            this.getSymbolTable().getTable().remove(parameter.getIdentifier());
        }
    }
}
