package compilator.visitor;

import compilator.object.Program;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ProgramVisitor extends SimpleJavaBaseVisitor<Program> {

    @Override
    public Program visitProgram(SimpleJavaParser.ProgramContext ctx)
    {
        return new Program(new BlockVisitor().visit(ctx.block()));
    }
}
