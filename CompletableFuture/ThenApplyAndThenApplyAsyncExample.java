
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Its a Synchronous execution.
// It uses same thread which completed the previous Async task

// 'thenApplyAsync' method
// Its Asynchronous execution.
// It uses diffenrent thread( from 'fork-pool', if we dont provide the executor in the method), to complete this function.
// If multiple 'thenApplyAsync' is used ordering can't be guarentee, they will run concurrently .

public class ThenApplyAndThenApplyAsyncExample {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

         CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{
            System.out.println("Thread name which run 'supplyAsync': " + Thread.currentThread().getName());
            return "My name is ";
         }, poolExecutor).thenApply((String val)->{
            System.out.println("Thread name which run 'thenApply': " + Thread.currentThread().getName());
            return val + "Kau kau.";
         });

         System.out.println("Output 1: " + asyncTask1.get());
        } catch (Exception e) {
            
        }


        try {
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

         CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(()->{
            System.out.println("Thread name which run 'supplyAsync': " + Thread.currentThread().getName());
            return "My name is ";
         }, poolExecutor).thenApplyAsync((String val)->{
            System.out.println("Thread name which run 'thenApplyAsync': " + Thread.currentThread().getName());
            return val + "Kau Kau Negi.";
         }, poolExecutor);
         System.out.println("Output 2: "+ asyncTask2.get());

        } catch (Exception e) {
            
        }

    }
}
