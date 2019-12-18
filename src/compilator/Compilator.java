package compilator;

import compilator.object.Program;
import compilator.object.instruction.Instruction;
import compilator.visitor.ProgramVisitor;
import generate.SimpleJavaLexer;
import generate.SimpleJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.List;

public class Compilator
{
    private static final Compilator instance = new Compilator();

    private Compilator(){};

    public static Compilator getInstance()
    {
        return instance;
    }

    public void run(CharStream input, String output)
    {
        SimpleJavaLexer lexer = new SimpleJavaLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(LexerParserErrorListener.getInstance());

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleJavaParser parser = new SimpleJavaParser(tokens);

        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        parser.addErrorListener(LexerParserErrorListener.getInstance());

        ParseTree parseTree = parser.program();

        Program program = null;
        try
        {
            program = new ProgramVisitor().visit(parseTree);
        }
        catch (Exception e)
        {
            System.out.println("Something goes wrong while parsing tree. " + e.getMessage());
            System.exit(0);
        }

        try
        {
            InstructionGenerator instructionGenerator = new InstructionGenerator(program);
            List<Instruction> instructions = instructionGenerator.generateInstructions();
            this.writeInstructions(output, instructions);
        }
        catch (Exception e)
        {
            System.out.println("Something goes wrong while generating instructions. " + e.getMessage());
            System.exit(0);
        }
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
