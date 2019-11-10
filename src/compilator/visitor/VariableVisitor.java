package compilator.visitor;

import compilator.value.Value;
import generate.*;

public class VariableVisitor extends SimpleJavaBaseVisitor<Value> {
    @Override
    public Value visitVariableDeclaration(SimpleJavaParser.VariableDeclarationContext ctx) {

        System.out.println(ctx.constDeclaration(0).localVariableDeclaration().decimalVariable().identifier().getText());
        System.out.println(ctx.constDeclaration(0).localVariableDeclaration().decimalVariable().DECIMAL().getText());
        //Variable variable = new Variable()

        return new Value("");
    }
}
