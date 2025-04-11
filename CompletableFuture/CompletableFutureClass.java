import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// CompletableFuture    (JAVA 8)
// Help in async programming.abstract 
// Advanced version of Future provides additional capabilities like CHAINING

// SupplyAsync method initiates an Async operation.
// 'supplier' is executed asynchromously in seperated thread.
// By deafault it uses shared FORK-JOIN POOL executor.
//  we can pass Executor in this method for more control on threads.
// public static<T> CompletableFuture<T> supplyAsync(Supplier<T> supplier);     uses fork-join pool 
// public static<T> CompletableFuture<T> supplyAsync(Supplier<T> supplier, Executor executor);   uses executor

public class CompletableFutureClass {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
            

            CompletableFuture<String> asyncTask = CompletableFuture.supplyAsync(() -> {
                return "task Completed";
            }, poolExecutor);
            
            System.out.println(asyncTask.get());
        } catch (Exception e) {
        }
    }
}
