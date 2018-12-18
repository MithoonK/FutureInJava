package Varargs;

public class Main {


    private static String testMethod (String k, String ...args) {
        String finalString = new String("");
        for (String arg : args) {
            finalString+=arg;
        }
        return finalString;
    }

    public static void main(String...args) {
        String [] someStrs = {};
        System.out.println("df" + testMethod("s", "sd"));
        //String str = anotherTestMethod("one", (first, second)-> someModification("a", "d"));
         
    }
    public static String anotherTestMethod(String firstName, String lastNme) {
        return null;
    }

    private static String someModification(String firstName, String lastName) {
        return firstName + lastName;
    }
}
