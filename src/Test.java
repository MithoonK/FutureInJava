import java.util.concurrent.*;
//Runnable has no return type
public class Test {

    public static CompletableFuture<String> getUserName() {
        return CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside the name task");
           return "name";
        });
    }

    public static CompletableFuture<Integer> getUserAge() {
        return CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside the age task");
            return 20;
        });
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        });
        CompletableFuture<Integer>completableFuture1 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10;
        });

        CompletableFuture<Integer> completableFuture2 = completableFuture1.thenCombine(completableFuture, (first, second )->{
            return first * second;
        });
        System.out.println("Printing the output " + completableFuture2.get() );
    }
}