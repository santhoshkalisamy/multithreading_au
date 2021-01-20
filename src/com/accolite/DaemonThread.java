package com.accolite;

public class DaemonThread {


  public static void main(String[] args) {
      Thread t1 =
              new Thread(
                      () -> {
                          try {
                              Thread.sleep(5);
                          } catch (InterruptedException e) {
                              e.printStackTrace();
                          }
                          System.out.println("Slept for 5s");
                      });

      t1.setDaemon(true);

      Thread t2 =
              new Thread(
                      () -> {
                          try {
                              Thread.sleep(1);
                          } catch (InterruptedException e) {
                              e.printStackTrace();
                          }
                          System.out.println("Slept for 1s");
                      });
      t1.start();
      t2.start();
  }
}
