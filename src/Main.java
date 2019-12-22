import compilator.Compilator;
import compilator.enums.EErrorCode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
    public static void main(String[] args) {
       // String input = args[0];
       // String input = "testFiles/statements/ifElse.txt";
        String input = "testFiles/complex/methodParametersReturn.txt";
        String output = "testFiles/output.txt";

        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);
        } catch (Exception e) {
            System.err.println("Error while loading file " + input);
            System.exit(EErrorCode.ERROR_LOADING_INPUT_FILE.getCode());
        }

        Compilator.getInstance().run(inputStream, output);
    }
}