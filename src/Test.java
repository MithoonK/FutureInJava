import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

//Runnable has no return type
public class Test {

    public static CompletableFuture<Integer> processData(Integer i) {
        return CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Inside the processData method");
            return i;
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> data = Arrays.asList(1,2,3,4);

        List<CompletableFuture<Integer>> dataFutures = data.stream()
                .map(datum -> processData(datum))
                .collect(Collectors.toList());
        for(int i = 0; i < dataFutures.size(); i++) {
            System.out.println("Printing " + dataFutures.get(i).get());
        }
        CompletableFuture<Void> allFutures  = CompletableFuture.allOf(dataFutures.toArray(new CompletableFuture[dataFutures.size()]));
        CompletableFuture<List<Integer>> allProcessedData = allFutures.thenApply((v)->{
           return dataFutures.stream().map(datumFuture -> datumFuture.join()).collect(Collectors.toList());
        });
        System.out.println("Printing the result of all the futures " + allProcessedData.get());
        System.out.println("Hello");
        System.out.println("Getting the result of all futures " + allFutures.get()) ;
    }
}