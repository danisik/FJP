package compilator.enums;

public enum EOperatorRelational
{
    EQUAL("=="),
    NOT_EQUAL("!="),
    LT("<"),
    LE("<="),
    GE(">="),
    GT(">");

    private String symbol;

    EOperatorRelational(String symbol)
    {
        this.symbol = symbol;
    }

    public static EOperatorRelational getSymbol(String value) {
        for(EOperatorRelational e: EOperatorRelational.values()) {
            if(e.symbol.equals(value))
            {
                return e;
            }
        }
        return null;
    }
}
