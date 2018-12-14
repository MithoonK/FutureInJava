package Varargs;

public class Main {


    private static String testMethod (String ...args) {
        String finalString = new String("");
        for (String arg : args) {
            finalString+=arg;
        }
        return finalString;
    }

    public static void main(String...args) {
        String [] someStrs = {"Life ", "is ", "so ", "much ", "indeterministic"};
        System.out.println(testMethod(someStrs));
    }
}
