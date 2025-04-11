import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// thenCombine and thenCombineAsync
// Used to combine the result of 2 comparable future

public class ThenCombineAndThenCombineAsyncExample {
    public static void main(String[] args) {
        try {
             ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1,
              TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

              CompletableFuture<Integer> asyncTask1 = CompletableFuture.supplyAsync(()->{
                return 10;
              }, poolExecutor);

              CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(()->{
                return " Thousand";
              }, poolExecutor);

              CompletableFuture<String> combinedFutureObj = asyncTask1.thenCombine(asyncTask2, (Integer val1, String val2)-> val1 + val2);

              System.out.println("Final ans: " + combinedFutureObj.get());

              poolExecutor.shutdown();


        } catch (Exception e) {
            
        }
    }
}
