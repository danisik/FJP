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

    public String getSymbol()
    {
        return this.symbol;
    }
}
