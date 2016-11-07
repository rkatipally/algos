package org.raj.core.threads;

/**
 * Created by rjk on 10/28/2016.
 */
public class Waiter implements Runnable{

    private Message message;

    public Waiter(Message message){
        this.message =  message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Waiter " + Thread.currentThread().getName() + " started!");
        try {
            synchronized (message) {
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                message.wait();
                System.out.println("Waiter " + Thread.currentThread().getName() + " Resumed!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
        //process the message now
        System.out.println(name+" processed: "+message.getMessage());    }
}
