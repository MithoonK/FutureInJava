import java.util.concurrent.*;
//Runnable has no return type
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Executors.newFixedThreadPool(10);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Hello World");
            return "some text";
        }, executor);
        System.out.println("Executing the main method");
        System.out.println("Priting the result of the completable future " + completableFuture.get());
        System.out.println("Completed the main method   ");
    }
}