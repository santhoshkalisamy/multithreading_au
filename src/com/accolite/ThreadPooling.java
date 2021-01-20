package com.accolite;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPooling {

  public static void main(String[] args) throws InterruptedException {
    ThreadGroup updateGroup = new ThreadGroup("Thread that do write operation");
    ThreadGroup readGroup = new ThreadGroup("Thread that do read operation");

    Thread t1 =
        new Thread(updateGroup,
            () -> {
                System.out.println(Thread.currentThread().getName());
            });
    t1.start();
      Thread t2 =
              new Thread(updateGroup,
                      () -> {
                          System.out.println(Thread.currentThread().getName());
                      });
      t2.start();
    updateGroup.list();
      }



}
