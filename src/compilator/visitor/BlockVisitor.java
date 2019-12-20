package compilator.visitor;

import compilator.object.Block;
import compilator.object.BlockStatement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class BlockVisitor extends SimpleJavaBaseVisitor<Block> {

    /**
     * Visitor for Block
     * @param ctx Block context
     * @return internal structure of Block
     */
    @Override
    public Block visitBlock(SimpleJavaParser.BlockContext ctx) {

        BlockStatement blockStatement = new BlockStatementVisitor().visit(ctx.blockStatement());

        return new Block(blockStatement);
    }
}
