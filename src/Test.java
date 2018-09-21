import java.util.concurrent.*;

public class Test {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "first future completed";
        });

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "second future completed";
        });

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "third future completed";
        });

        CompletableFuture<Object> completableFuture3 = CompletableFuture.anyOf(completableFuture, completableFuture1, completableFuture2);
        System.out.println(completableFuture3.get());
    }



}