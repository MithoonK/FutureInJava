package TestBuilderConcept;

public class Test {
    public static void main(String[] args) {
        New one = new New.Builder().setStr("Some string").build();
        System.out.println("dekh bhai kya hota hai " + one.getStr());
    }
}
