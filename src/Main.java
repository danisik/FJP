import compilator.Compilator;
import compilator.compilerPart.BaseCompiler;
import compilator.object.instruction.Instruction;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
       // String input = args[0];
       // String input = "testFiles/statements/ifElse.txt";
        String input = "testFiles/statements/loops/doWhile.txt";
        String output = "testFiles/output.txt";


        CharStream inputStream = null;
        try {
            inputStream = CharStreams.fromFileName(input);
        } catch (IOException e) {
            System.err.println("Error while loading file " + input);
            System.exit(0);
        }


        Compilator.getInstance().run(inputStream, output);

    }

}