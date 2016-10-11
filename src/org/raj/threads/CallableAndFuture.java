package org.raj.threads;

import java.util.concurrent.*;

/**
 * Created by RJK on 10/11/2016.
 */
public class CallableAndFuture {

    public static void main(String []args) throws ExecutionException, InterruptedException, TimeoutException {

        Callable<Integer> task = () ->{
            try{
                TimeUnit.SECONDS.sleep(3);
                return 123;
            }catch (InterruptedException ex){
                throw new IllegalStateException("Task interrupted " + ex);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);
        System.out.println("future done? " + future.isDone());
//        executor.shutdownNow(); // Will throw exception as future is not done
        Integer result = future.get(); //blocks the current thread and waits until the callable completes
        //Integer result = future.get(1, TimeUnit.SECONDS);//Exception as callable needs 3 seconds
        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);

    }
}
