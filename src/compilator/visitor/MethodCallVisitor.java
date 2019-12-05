package compilator.visitor;

import compilator.object.MethodCall;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class MethodCallVisitor extends SimpleJavaBaseVisitor<MethodCall>
{
    @Override
    public MethodCall visitMethodCall(SimpleJavaParser.MethodCallContext ctx)
    {
        String identifier = ctx.identifier().getText();

        return new MethodCall(identifier);
    }


}
