package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;

public class MethodCallCompiler extends BaseCompiler
{
    private MethodCall methodCall;
    private int level;

    public MethodCallCompiler(MethodCall methodCall, int level)
    {
        this.methodCall = methodCall;
        this.level = level;
    }

    public void run()
    {
        if (methodCall.getExpectedReturnType() != EMethodReturnType.VOID)
        {
            // return value
            this.addInstruction(EInstruction.INT, 0, 1);
        }

        // add parameters to stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            MethodCallParameter parameter = this.methodCall.getParameters().get(i);
            EVariableType returnType = new ExpressionCompiler(parameter.getExpression(), this.level).runReturnType();
            this.methodCall.getParameters().get(i).setVariableType(returnType);

        }

        // add call
        this.addMethodCallInstruction(EInstruction.CAL, this.level, methodCall);

        // remove parameterst from stack top
        for (int i = 0 ; i < this.methodCall.getParameters().size() ; i++)
        {
            this.addInstruction(EInstruction.STO, 0, -1);
        }

    }
}
