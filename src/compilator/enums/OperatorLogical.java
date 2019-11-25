package compilator.enums;

public enum OperatorLogical {

    AND("and"),
    OR("or");


    private String symbol;

    OperatorLogical(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol()
    {
        return this.symbol;
    }
}
