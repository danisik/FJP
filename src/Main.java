import compilator.Compilator;

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
                                                "void function abx()" +
                                                "{" +
                                                "int in = 1; " +
                                                "return;" +
                                                "} " +
                                                "switch(1){" +
                                                "    case 1:{ int i = 1;}" +
                                                "    case 2:{ int i = 2;}" +
                                                "    default: {boolean c = false;}" +
                                                "}" +

                                            "}");

    }


}