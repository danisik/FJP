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

    public String getSymbol()
    {
        return this.symbol;
    }

}
