package org.raj.core.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by RJK on 10/11/2016.
 */
public class InvokeTester {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
                () -> "task1",
                () -> "task2",
                () -> "task3"
        );

        executor.invokeAll(callables).stream().map(future -> {
            try{
                return future.get();
            }
            catch (Exception e){
                throw new IllegalStateException(e);
            }
        }).forEach(System.out::println);

        String result = executor.invokeAny(callables);
        System.out.println(result);
    }
}
