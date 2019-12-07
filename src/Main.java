import compilator.Compilator;
import compilator.compilerPart.BaseCompiler;
import compilator.enums.EInstruction;
import compilator.object.instruction.Instruction;
import compilator.object.symbolTable.SymbolTable;
import compilator.object.symbolTable.SymbolTableItem;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Compilator.getInstance().run("{" +
                                                "int test1 = ttest = 10; " +
                                                "int test11 = test1;" +
                                                "boolean test2 = test1;" +
                                                "const int test3 = testp1 = testp2 = 30;" +
                                                "for(a=0 ... 10){int s = 1;} " +
                                                "int test4 = 40;" +
                                                "test4 = 40;" +
                                                "do{boolean a = true;}while(1) " +
                                                "while(1){}" +
                                                "void function abx(int a, boolean b)" +
                                                "{" +
                                                    "int in = 1; " +
                                                    "int in2 = 1; " +
                                                    "while(1){}" +
                                                    "return;" +
                                                "} " +
                                                "switch(1){" +
                                                "    case 1:{ int i = 1;}" +
                                                "    case 2:{ int i = 2;}" +
                                                "    default: {boolean c = false;}" +
                                                "}" +
                                                "functionTest(a,1,true);" +
                                                "int test5 = declare(a,1,true);" +

                "}");

        BaseCompiler baseCompiler = new BaseCompiler();
        for (Instruction instruction : baseCompiler.getInstructionsList()
             )
        {
            System.out.println(instruction);
        }




    }

}