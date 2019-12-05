package compilator.visitor;

import compilator.enums.EVariableType;
import compilator.object.Variable;
import compilator.value.Value;
import generate.*;

import java.util.ArrayList;
import java.util.List;

public class VariableVisitor extends SimpleJavaBaseVisitor<Variable> {
    @Override
    public Variable visitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx) {

        if (ctx.localVariableDeclaration() != null)
        {
            return this.createVariable(ctx.localVariableDeclaration());
        }
        else if (ctx.constVariableDeclaration() != null)
        {
            return this.createConstantVariable(ctx.constVariableDeclaration());
        }

        return null;
    }

    private Variable createConstantVariable(SimpleJavaParser.ConstVariableDeclarationContext ctx)
    {
        Variable variable = this.createVariable(ctx.localVariableDeclaration());
        variable.setConstant(true);

        return variable;
    }

    private Variable createVariable(SimpleJavaParser.LocalVariableDeclarationContext ctx)
    {
        Variable variable = null;

        if (ctx.decimalVariable() != null)
        {
            String name = ctx.decimalVariable().identifier().getText();
            int val = Integer.parseInt(ctx.decimalVariable().decimalValue().getText());

            variable = new Variable(name, new Value(val), EVariableType.INT);

            if (ctx.decimalVariable().paralelDeclaration() != null)
            {
                variable.setParallelArray(this.getParallel(ctx.decimalVariable().paralelDeclaration()));
            }

        }
        else if (ctx.boolVariable() != null)
        {
            String name = ctx.boolVariable().identifier().getText();
            boolean val = Boolean.parseBoolean(ctx.boolVariable().boolValue().getText());

            variable = new Variable(name, new Value(val), EVariableType.BOOLEAN);

            if (ctx.boolVariable().paralelDeclaration() != null)
            {
                variable.setParallelArray(this.getParallel(ctx.boolVariable().paralelDeclaration()));
            }
        }

        return  variable;
    }

    private List<String> getParallel(List<SimpleJavaParser.ParalelDeclarationContext> ctx)
    {
        List<String> parallel = new ArrayList<>();

        for (int i = 0 ; i < ctx.size() ; i++)
        {
            parallel.add(ctx.get(i).identifier().getText());
        }

        return parallel;
    }
}
