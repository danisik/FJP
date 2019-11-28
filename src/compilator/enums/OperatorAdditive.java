package compilator.enums;

public enum OperatorAdditive {
    PLUS("+"),
    MINUS("-");

    private String symbol;

    OperatorAdditive(String symbol)
    {
        this.symbol = symbol;
    }

    public static OperatorAdditive getSymbol(String value) {
        for(OperatorAdditive e: OperatorAdditive.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }
}
