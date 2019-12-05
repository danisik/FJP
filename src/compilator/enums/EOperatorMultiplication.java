package compilator.enums;

public enum EOperatorMultiplication
{
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private String symbol;

    EOperatorMultiplication(String symbol)
    {
        this.symbol = symbol;
    }

    public static EOperatorMultiplication getSymbol(String value) {
        for(EOperatorMultiplication e: EOperatorMultiplication.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }

}
