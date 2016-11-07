package org.raj.core.threads;

/**
 * Created by rjk on 10/28/2016.
 */
public class WaitAndNotifyTester {

    public static  void main(String[] args){
        Message message = new Message("Hello World!");
        Waiter waiter1 = new Waiter(message);
        Waiter waiter2 = new Waiter(message);

        Notifier notifier = new Notifier(message);

        new Thread(waiter1, "waiter1").start();
        new Thread(waiter2, "waiter2").start();
        new Thread(notifier, "notifier").start();

        System.out.println("All threads are started");
    }
}
