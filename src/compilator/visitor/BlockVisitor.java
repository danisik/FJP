package compilator.visitor;

import compilator.value.Value;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class BlockVisitor extends SimpleJavaBaseVisitor<Value> {
    @Override
    public Value visitBlock(SimpleJavaParser.BlockContext ctx) {
         new VariableVisitor().visit(ctx.blockStatement(0));

         return new Value("test");
    }
}
