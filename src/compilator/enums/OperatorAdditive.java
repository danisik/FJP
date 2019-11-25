package compilator.enums;

public enum OperatorAdditive {
    PLUS("+"),
    MINUS("-");

    private String symbol;

    OperatorAdditive(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol()
    {
        return this.symbol;
    }
}
