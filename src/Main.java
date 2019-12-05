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
                                                "boolean test2 = true;" +
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
                                                "functionTest();" +

                                            "}");

        BaseCompiler baseCompiler = new BaseCompiler();
        for (Instruction instruction : baseCompiler.getInstructionsList()
             )
        {
            System.out.println(instruction);
        }

        for(Map.Entry<String, SymbolTableItem> entry : SymbolTable.getInstance().getTable().entrySet()) {
            String key = entry.getKey();
            SymbolTableItem value = entry.getValue();

            System.out.println(value);
        }


    }

}