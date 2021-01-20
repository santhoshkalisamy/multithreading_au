package com.accolite;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadJoin {

  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    Thread t1 =
        new Thread(
            () -> {
              int num = 0;
              for (int i = 0; i < 10000; i++) {
               // counter.inc();
              }
            });

    Thread t2 =
        new Thread(
            () -> {
              int num = 0;
              for (int i = 0; i < 10000; i++) {
                counter.dec();
              }
            });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(counter.getNum());
  }
}

class Counter {
  private AtomicInteger num = new AtomicInteger(0);

  AtomicReference<String> atomicReference = new AtomicReference<>("Sample String");

  private Object lockObject = new Object();



  private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

  //Lock readLock = reentrantReadWriteLock.readLock();

  //Lock writeLock = reentrantReadWriteLock.writeLock();

  Semaphore semaphore = new Semaphore(5);

  ReentrantLock reentrantLock = new ReentrantLock();

  Counter() {
    //num = 0;
  }

  // t1
  public void inc() throws InterruptedException {

    num.incrementAndGet();

    // get current value of num - t1 (100)
    // increment it by 1 - t1 (101)
    // assign result to num - 101 t1
  }

  // t2
  public void dec() {
    //condition.signal();
   // readLock.lock();
      num.getAndAdd(-6);

           //   --num
         // num--
   // readLock.unlock();

    // get current value of num - t2 (100)
    // decrement it by 1 (99)
    // assign result to num 99 (t2)

  }

  // t3
  public int getNum() {
    return 0;
  }
}
