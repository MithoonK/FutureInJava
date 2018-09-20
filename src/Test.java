import java.util.concurrent.*;

public class Test {
    public static void main(String [] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture =  new CompletableFuture<String>();
        completableFuture.get();
        System.out.println("At the end of the main function");
    }
}
