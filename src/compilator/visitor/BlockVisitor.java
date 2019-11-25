package compilator.visitor;

import compilator.object.Block;
import compilator.object.BlockStatement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class BlockVisitor extends SimpleJavaBaseVisitor<Block> {
    @Override
    public Block visitBlock(SimpleJavaParser.BlockContext ctx) {

        BlockStatement blockStatement = new BlockStatementVisitor().visit(ctx.blockStatement());


        return new Block();
    }
}
