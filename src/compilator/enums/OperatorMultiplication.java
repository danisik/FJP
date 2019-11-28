package compilator.enums;

public enum OperatorMultiplication {
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private String symbol;

    OperatorMultiplication(String symbol)
    {
        this.symbol = symbol;
    }

    public static OperatorMultiplication getSymbol(String value) {
        for(OperatorMultiplication e: OperatorMultiplication.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }

}
