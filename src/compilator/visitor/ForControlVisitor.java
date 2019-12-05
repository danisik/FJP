package compilator.visitor;

import compilator.object.control.ControlFor;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ForControlVisitor extends SimpleJavaBaseVisitor<ControlFor>
{
    @Override
    public ControlFor visitForControl(SimpleJavaParser.ForControlContext ctx)
    {
        String identifier = ctx.identifier().getText();
        int from = Integer.parseInt(ctx.DECIMAL(0).getText());
        int to = Integer.parseInt(ctx.DECIMAL(1).getText());

        return new ControlFor(identifier, from, to);
    }
}
