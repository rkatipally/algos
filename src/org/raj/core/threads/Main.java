package org.raj.core.threads;

import java.util.concurrent.TimeUnit;

/**
 * Created by RJK on 10/11/2016.
 */
public class Main {

    public static void main(String args[]) {
        Runnable task = () -> {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println("Hello " + threadName);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}
