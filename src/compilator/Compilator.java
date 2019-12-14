package compilator;

import compilator.object.Program;
import compilator.object.instruction.Instruction;
import compilator.visitor.ProgramVisitor;
import generate.SimpleJavaLexer;
import generate.SimpleJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Compilator
{
    private static final Compilator instance = new Compilator();

    private Compilator()
    {
    }

    ;

    public static Compilator getInstance()
    {
        return instance;
    }

    public void run(CharStream input, String output)
    {
        SimpleJavaLexer lexer = new SimpleJavaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleJavaParser parser = new SimpleJavaParser(tokens);

        parser.setBuildParseTree(true);

        ParseTree parseTree = parser.program();

        Program program = new ProgramVisitor().visit(parseTree);

        InstructionGenerator instructionGenerator = new InstructionGenerator(program);
        List<Instruction> instructions = instructionGenerator.generateInstructions();

        this.writeInstructions(output, instructions);
    }

    private void writeInstructions(String outputFile, List<Instruction> instructions)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(outputFile, "UTF-8");

            for (Instruction instruction: instructions)
            {
                writer.write(instruction.toString());
            }

            writer.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
