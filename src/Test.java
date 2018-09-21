import java.util.concurrent.*;
//Runnable has no return type
public class Test {

    public static CompletableFuture<String> getUserName() {
        return CompletableFuture.supplyAsync(()->{
            System.out.println("Inside the name task");
           return "name";
        });
    }

    public static CompletableFuture<Integer> getUserAge() {
        return CompletableFuture.supplyAsync(()->{
            System.out.println("Inside the age task");
            return 20;
        });
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("Inside completable future");
            return "Yes";
        });
        CompletableFuture<Integer> futureCompletableFuture = getUserName().thenCompose((arg)->{
            return getUserAge();
        });
        System.out.println("Final outcome " + futureCompletableFuture.get());
    }
}