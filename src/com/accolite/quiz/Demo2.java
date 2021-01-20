package com.accolite.quiz;

class MyThread2 extends Thread {
  MyThread2() {}

  MyThread2(Runnable r) {
    super(r);
  }

  public void run() {
    System.out.println("Inside Thread ");
  }
}

class RunnableDemo implements Runnable {
  public void run() {
    System.out.println(" Inside Runnable");
  }
}

class Demo2 {
  public static void main(String[] args) {
    new MyThread2().start();
    new MyThread2(new RunnableDemo()).start();
  }
}
