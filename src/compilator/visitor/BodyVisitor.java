package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.Body;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class BodyVisitor extends SimpleJavaBaseVisitor<Body> {

    @Override
    public Body visitBody(SimpleJavaParser.BodyContext ctx) {

        BlockStatement blockStatement = null;

        if (ctx.blockBody() != null)
        {
            blockStatement = new BlockStatementVisitor().visit(ctx.blockBody());
        }

        return new Body(blockStatement);
    }
}
