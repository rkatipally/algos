package org.raj.core.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by RJK on 10/11/2016.
 */
public class ScheduledTask {
    public static void main(String args[]) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor.schedule(task,3, TimeUnit.SECONDS);
        TimeUnit.MICROSECONDS.sleep(1337);
        long remainingDelay = future.getDelay(TimeUnit.MICROSECONDS);
        System.out.printf("Remaining Delay: %sms", remainingDelay);
    }
}
