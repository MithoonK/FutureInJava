import java.util.concurrent.*;

public class Test {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        int age = 1;
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            if (age < 0) {
                throw new IllegalArgumentException("Age can not be negative");
            } else {
                return "ok";
            }
        }).handle((res, ex) ->{
            if (res == null) {
                return "Exception occured";
            } else {
                return "no exception";
            }
        });
        System.out.println("Printing the outcome " + completableFuture.get());
    }



}