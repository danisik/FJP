package compilator.enums;

public enum OperatorLogical {

    AND("and"),
    OR("or");


    private String symbol;

    OperatorLogical(String symbol)
    {
        this.symbol = symbol;
    }

    public static OperatorLogical getSymbol(String value) {
        for(OperatorLogical e: OperatorLogical.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }
}
