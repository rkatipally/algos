package org.raj.core.threads;

/**
 * Created by rjk on 10/28/2016.
 */
public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println("Notifier " + Thread.currentThread().getName() + " started!");
        synchronized (message) {
            message.setMessage("Hello From Notifier");
            //message.notify(); Only one waiter gor notified
            message.notifyAll();
        }
        System.out.println("Waiter " + Thread.currentThread().getName() + " ended!");

    }
}
