import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// thenAccept and thenAcceptASync
// Generally end stage in chain of Async operation.
// It does not return anything.

public class ThenAcceptAndThenAcceptAsyncExample {
    public static void main(String[] args) {
        try {
             ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1,
              TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

              CompletableFuture<Void> compFutureObj = CompletableFuture.supplyAsync(()->{
                System.out.println("Thread name which run 'supplyAsync': " + Thread.currentThread().getName());
                return "Hello ";
              }, poolExecutor).thenAcceptAsync((String val)->{
                System.out.println(val + " All stages Completed");
              });

              System.out.println(compFutureObj.get());

              poolExecutor.shutdown();
              
        } catch (Exception e) {
            
        }
    }
}
