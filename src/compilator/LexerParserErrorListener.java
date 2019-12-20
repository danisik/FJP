package compilator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class LexerParserErrorListener extends BaseErrorListener
{
    private static final LexerParserErrorListener instance = new LexerParserErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException
    {
        System.out.println("line " + line + " " + msg);
        System.exit(0);
    }

    public static LexerParserErrorListener getInstance()
    {
        return instance;
    }

}
