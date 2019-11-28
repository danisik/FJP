package compilator.enums;

public enum OperatorRelational {
    EQUAL("=="),
    NOT_EQUAL("!="),
    LT("<"),
    LE("<="),
    GE(">="),
    GT(">");

    private String symbol;

    OperatorRelational(String symbol)
    {
        this.symbol = symbol;
    }

    public static OperatorRelational getSymbol(String value) {
        for(OperatorRelational e: OperatorRelational.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }
}
