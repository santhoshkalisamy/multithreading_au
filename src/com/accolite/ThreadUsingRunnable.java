package com.accolite;

public class ThreadUsingRunnable implements Runnable {

    @Override
    public void run() {
    System.out.println("This is inside runnable");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
