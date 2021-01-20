package com.accolite;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
//    SampleThread thread = new SampleThread();
//    Thread2 thread2 = new Thread2(() -> System.out.println("Lambda"));
//    thread.start();
//    thread2.start();
//
//    Runnable runnable = new ThreadUsingRunnable();
//
//    Thread threadRunnable = new Thread(runnable);
//    threadRunnable.run();
//
//    new Thread(() -> System.out.println("Lambda")).start();
//
//    System.out.println("Main method is completed");
//

//    CallableThreads callableThreads = new CallableThreads();
//    ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//    Future<Integer> future = executorService.submit(callableThreads);
//
//    if(future.isDone()) {
//      System.out.println("Returned Value "+ future.get());
//    }
//
//    System.out.println("Done");


   // executorService.shutdown();

  }
}

class Thread2 extends Thread {
  Thread2(Runnable runnable){
    super(runnable);
  }
  // Run
  @Override
  public void run() {
    System.out.println("I'm inside thread2");
  }



}
