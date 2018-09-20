import java.util.concurrent.*;
//Runnable has no return type
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<String>();
        completableFuture.complete("Manual result");
        System.out.println(completableFuture.get());
    }
}