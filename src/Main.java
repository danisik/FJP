import compilator.Compilator;
import compilator.compilerPart.BaseCompiler;
import compilator.object.instruction.Instruction;


public class Main {
    public static void main(String[] args) {

        Compilator.getInstance().run("{" +
         //                                       "int test1 = ttest = 10; " +
         //                                       "boolean test11 = (1*2*3*4) > 30;" +
        /*                                        "boolean test2 = true;" +
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
                                                "int test5 = declare(a,1,true);" +*/
                                                "int test5 = abx(int : 5, boolean: true);" +
                                                "test5 = ab(int : 5);" +
                                                "int function abx(int c, boolean b)" +
                                                "{" +
                                                    "int test = ab(int : 5); " +
                                                    "test5 = 100; " +
                                                    "return 100;" +
                                                "} " +
                                                "int function ab(int c)" +
                                                "{" +
                                                    "int test = 13; " +
                                                    "test5 = 100; " +
                                                    "return 200;" +
                                                "} " +

                "}");

        BaseCompiler baseCompiler = new BaseCompiler();
        for (Instruction instruction : baseCompiler.getInstructionsList()
             )
        {
            System.out.println(instruction);
        }




    }

}