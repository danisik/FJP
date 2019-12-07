package compilator.error;

public class ErrorMismatchTypes extends Error
{
    public ErrorMismatchTypes(String variableName, String variableTypeOriginal, String variableTypeAssign)
    {
        super("Mismatch variable types. You are trying assign " + variableTypeAssign + " value to variable " + variableName + " which is " + variableTypeOriginal);
    }
}
