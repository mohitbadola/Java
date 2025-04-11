import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


// thenCompose and thenComposeAsync
// Chain together dependent async operations
// Means when new async operation depends on result of previous we can tied them together.
// For async tasks we can bring ORDERING using this

public class ThenComposeAndThenComposeAsyncExample {
    public static void main(String[] args) {
        try {
             ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1,
              TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

              CompletableFuture<String> compFutureObj = CompletableFuture.supplyAsync(()->{
                return "Hello ";
              }, poolExecutor).thenComposeAsync((String val)->{
                return CompletableFuture.supplyAsync(()->val + "Kaukau.");
              }, poolExecutor);

              System.out.println(compFutureObj.get());

        } catch (Exception e) {
            
        }
    }
}
