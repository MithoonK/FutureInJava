import java.util.concurrent.*;

public class Test {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        int age = -1;
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            if (age < 0) {
                throw new IllegalArgumentException("Age can not be negative");
            } else {
                return "ok";
            }
        }).exceptionally(ex ->{
            return "Exception";
        });
        System.out.println("Printing the outcome " + completableFuture.get());
    }



}