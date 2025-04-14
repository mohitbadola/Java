
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

// WorkStealing Pool Executor:

// It creates Fork-Join Pool Executor.
// No of threads depedns upon Available processors or we can specify in parameters.
// There are 2 queues:
// 1) Submission Queue
// 2)Work-Stealing Queue for each thread(It's Dequeue).
// STEPS:
// If all threads are busy, task would be placed in "Submission Queue". (or whenever we call submit() method, tasks goes into submission queue only)
// Lets say task1 picked by ThreadA. And if 2 subtasks created using fork() method. Subtask1 will be executed by ThreadA only and Subtask2 is put into the ThreadA work-stealing queue.
// If any other thread becomes free, and there is no task in Submission queue, it can "STEAL" the task from the other thread work-stealing queue.
// - Task can be split into multiple small sub-tasks. For that Task should extend:
// ◇ RecursiveTask -> returns value
// ◇ RecursiveAction -> doesn't return value
// We can create Fork-Join Pool using "newWorkStealingPool" method in ExecutorService 
// or By calling ForkJoinPool.commonPool() method.



class ComputeSumTask extends RecursiveTask<Integer>{
    int start;
    int end;
    ComputeSumTask(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        if(end-start<=4){
            int totalSum = 0;
            for(int i = start; i<=end; i++){
                totalSum += i;
            }
            return totalSum;
        } else{
            int mid = ( start + end ) / 2;
            ComputeSumTask leftTask = new ComputeSumTask(start, mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid+1, end);

            // Fork the tasks for parallel execution
            leftTask.fork();
            rightTask.fork();

            // Combine results of subtasks
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            return leftResult + rightResult;

        }
    }
    
}

public class ForkJoinPoolEx {
    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0, 100));
        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {

        }
    }
}
