package compilator.error;

public class ErrorMismatchTypesExpression extends Error
{
    public ErrorMismatchTypesExpression(String expectedType, String type1, String type2)
    {
        super("Mismatch expression result type. Got " + type1 + " and " + type2 + ". Both results should be type " + expectedType);
    }

    public ErrorMismatchTypesExpression(String expectedType, String type)
    {
        super("Mismatch expression result type. Got " + type + ". Result should be type " + expectedType);
    }
}
