import compilator.Compilator;

public class Main {
    public static void main(String[] args) {

        Compilator.getInstance().run("{" +
                                                "int test = ttest = 10; " +
                                                "boolean test2 = true;" +
                                                "const int test3 = testp1 = testp2 = 30;" +
                                                "void function abx()" +
                                                "{" +
                                                    "int in = 1; " +
                                                    "return;" +
                                                "} " +
                                                "int test4 = 40;" +
                                                "do{}while(1) " +
                                                "while(1){}" +
                                            "}");

    }
}