package compilator.error;

public class ErrorMismatchTypesVariable extends Error
{
    public ErrorMismatchTypesVariable(String variableName, String variableTypeOriginal, String variableTypeAssign)
    {
        super("Mismatch variable types. You are trying assign " + variableTypeAssign + " value to variable " + variableName + " which is " + variableTypeOriginal);
    }
}
