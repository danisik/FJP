package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.Variable;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlockStatementVisitor extends SimpleJavaBaseVisitor<BlockStatement> {

    public BlockStatement visitBlockStatement(SimpleJavaParser.BlockStatementContext ctx)
    {
        HashMap<String, Variable> variables = new HashMap<>();
        Variable variable;


        for (int i = 0 ; i < ctx.variableDeclaration().size() ; i++)
        {
            variable = new VariableVisitor().visit(ctx.variableDeclaration(i));

            variables.put(variable.getName(), variable);

            if (variable.existsParallel())
            {
                for (String name: variable.getParallelArray())
                {
                    variables.put(name, new Variable(name, variable.getValue(), variable.getType(), variable.isConstant()));
                }
            }
        }


        for(Map.Entry<String, Variable> entry : variables.entrySet()) {
            String key = entry.getKey();
            Variable e = entry.getValue();

            System.out.println(e.getName() + " " + e.getValue() + " " + e.isConstant());
        }


        return new BlockStatement();
    }

}
