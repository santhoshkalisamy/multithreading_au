package com.accolite;

public class ShutdownHook {
  public static void main(String[] args) {
    System.out.println("Main started");

    Thread thread =  new Thread(
            () -> {
                System.out.println("VM is shutting down. Doing all cleanups");
            });


    Runtime.getRuntime()
        .addShutdownHook(thread);


    System.exit(0);


    System.out.println("Main ended");
  }
}
