package org.raj.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by RJK on 10/11/2016.
 */
public class ExecutorTester {

    static public void main(String args[]){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->{
           String threadName =   Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });


        try {
            System.out.println("Shutdown attempt");
            executorService.shutdown();
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            if(executorService.isTerminated()){
                System.out.println("Cancel all");
            }
            executorService.shutdownNow();
            System.out.println("Shutdown finished");
        }
    }

}
