package compilator.visitor;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableDeclaration;
import compilator.enums.EVariableType;
import compilator.object.Variable;
import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
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
        // decimal
        if (ctx.decimalVariable() != null)
        {
            variable = this.createDecimal(ctx.decimalVariable());
        }
        // boolean
        else if (ctx.boolVariable() != null)
        {
            variable = this.createBoolean(ctx.boolVariable());
        }

        return  variable;
    }

    private Variable createDecimal(SimpleJavaParser.DecimalVariableContext ctx)
    {
        Variable variable = null;

        String name = ctx.identifier().getText();

        // int a = 1;
        if (ctx.decimalValue().DECIMAL() != null)
        {
            int dimension = 1;
            if (ctx.operator() != null && ctx.operator().getText().equals("-"))
            {
                dimension = -1;
            }
            int val = Integer.parseInt(ctx.decimalValue().getText());

            variable = new Variable(name, new Value(val * dimension), EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.DECIMAL);
        }
        // int a = b;
        else if (ctx.decimalValue().identifier() != null)
        {
            String val = ctx.decimalValue().identifier().getText();

            variable = new Variable(name, new Value(val), EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.IDENTIFIER);
        }
        // int a = declare();
        else if (ctx.decimalValue().methodCall() != null)
        {
            MethodCall methodCall = new MethodCallVisitor().visit(ctx.decimalValue().methodCall());
            methodCall.setExpectedReturnType(EMethodReturnType.INT);

            variable = new Variable(name,methodCall, EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.METHOD_CALL);
        }
        // int a = 1 + 2 + a;
        else if (ctx.decimalValue().expressionBody() != null)
        {
            Expression expression = new ExpressionBodyVisitor().visit(ctx.decimalValue().expressionBody());

            variable = new Variable(name, expression, EVariableType.INT);
            variable.setVariableDeclaration(EVariableDeclaration.EXPRESSION);
        }


        if (ctx.paralelDeclaration() != null)
        {
            if (variable != null)
            {
                variable.setParallelArray(this.getParallel(ctx.paralelDeclaration()));
            }
        }

        return variable;
    }

    private Variable createBoolean(SimpleJavaParser.BoolVariableContext ctx)
    {
        Variable variable = null;

        String name = ctx.identifier().getText();

        // boolean a = true;
        if (ctx.boolValue().booleanValue() != null)
        {
            boolean val = Boolean.parseBoolean(ctx.boolValue().booleanValue().getText());

            variable = new Variable(name, new Value(val), EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.BOOLEAN);
        }
        // boolean a = b;
        else if (ctx.boolValue().identifier() != null)
        {
            String val = ctx.boolValue().identifier().getText();

            variable = new Variable(name, new Value(val), EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.IDENTIFIER);

        }
        // boolean a = declaration();
        else if (ctx.boolValue().methodCall() != null)
        {
            MethodCall methodCall = new MethodCallVisitor().visit(ctx.boolValue().methodCall());
            methodCall.setExpectedReturnType(EMethodReturnType.BOOLEAN);


            variable = new Variable(name, methodCall, EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.METHOD_CALL);

        }
        // boolean a = a && b;
        else if (ctx.boolValue().expressionBody() != null)
        {
            Expression expression = new ExpressionBodyVisitor().visit(ctx.boolValue().expressionBody());

            variable = new Variable(name, expression, EVariableType.BOOLEAN);
            variable.setVariableDeclaration(EVariableDeclaration.EXPRESSION);
        }


        if (ctx.paralelDeclaration() != null)
        {
            if (variable != null)
            {
                variable.setParallelArray(this.getParallel(ctx.paralelDeclaration()));
            }
        }

        return variable;
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
