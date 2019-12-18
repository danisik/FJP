package compilator.error;

import compilator.enums.EVariableType;

public class ErrorMismatchMethodAndCallParameterTypes extends Error
{
    public ErrorMismatchMethodAndCallParameterTypes(String name, EVariableType need, EVariableType got, int index, int line)
    {
        super("Invalid call of method \"" + name + "\". " + index + ". parameter should be " + need + ", got " + got + ".", line);
    }
}
