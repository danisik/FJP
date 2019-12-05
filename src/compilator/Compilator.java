package compilator;

import compilator.object.Program;
import compilator.visitor.ProgramVisitor;
import generate.SimpleJavaLexer;
import generate.SimpleJavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compilator {
    private static final Compilator instance = new Compilator();

    private Compilator(){};

    public static Compilator getInstance()
    {
        return instance;
    }

    public void run(String input)
    {
        CharStream convertedInput = CharStreams.fromString(input);
        SimpleJavaLexer lexer = new SimpleJavaLexer(convertedInput);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SimpleJavaParser parser = new SimpleJavaParser(tokens);

        parser.setBuildParseTree(true);

        ParseTree parseTree = parser.program();

        Program program = new ProgramVisitor().visit(parseTree);

        InstructionGenerator instructionGenerator = new InstructionGenerator(program);
        instructionGenerator.generateInstructions();
    }
}
