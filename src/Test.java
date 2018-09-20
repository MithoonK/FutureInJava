import java.util.concurrent.*;
//Runnable has no return type
public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("In the start of the run method of runnable");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("In the end of the method inside run");
            }
        });

        System.out.println("here");
        System.out.println("printing the result of the future " + completableFuture.get());
        System.out.println("at the end");
    }

}