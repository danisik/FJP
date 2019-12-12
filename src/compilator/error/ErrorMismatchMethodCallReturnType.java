package compilator.error;

import compilator.enums.EMethodReturnType;

public class ErrorMismatchMethodCallReturnType extends Error
{
    public ErrorMismatchMethodCallReturnType(String name, EMethodReturnType expectedType, EMethodReturnType type)
    {
        super("Invalid call of method " + name + ". You are trying assign " + type.toString() + " to " + expectedType.toString() + ".");
    }
}
