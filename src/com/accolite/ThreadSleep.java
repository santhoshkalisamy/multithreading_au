package com.accolite;

public class ThreadSleep {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main thread started...");

    Thread t1 =
        new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {
                System.out.println("Number : "+i);
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
            });
      t1.start();

      System.out.println("Main thread ended...");

  }
}
