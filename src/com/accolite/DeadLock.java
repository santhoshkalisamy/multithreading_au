package com.accolite;

public class DeadLock {
  public static void main(String[] args) {
    Kitchen kitchen = new Kitchen();
    Thread t1 =
        new Thread(
            () -> {
              kitchen.eatFruit();
            });
    Thread t2 =
        new Thread(
            () -> {
              kitchen.eatFruit2();
            });

    t1.start();
    t2.start();
  }
}

class Kitchen {
  private String fruit;
  private String knife;

  Boolean isDone = true;

  Kitchen() {
    this.fruit = "Appple";
    this.knife = "Sharp";
  }

  public void eatFruit() {
    synchronized (fruit) {
      System.out.println("I have acquired fruit, now I need knife");
      synchronized (knife) {
        System.out.println("I have acquired knife, now I can eat");
        // Actual
      }
    }
  }

  public void eatFruit2() {
    synchronized (knife) {
      System.out.println("I have acquired knife, now I need fruit");
      synchronized (fruit) {
        System.out.println("I have acquired fruit, now I can eat");
        // Actual
      }
    }
  }
}

class WaitThread extends Thread {}
