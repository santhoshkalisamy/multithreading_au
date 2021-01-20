package com.accolite;

public class WaitThread2 {
  public static void main(String[] args) {
    Hostel canteen = new Hostel();
    Thread t1 = new Thread(() -> {
      try {
        canteen.eatFood();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    t1.start();

    Thread t2 = new Thread(() -> {
      canteen.addFood("Rice");
    });
    t2.start();
  }

}

class Hostel {
  private String foodInPlate;

  Hostel() {
    foodInPlate = "";
  }

  public synchronized void addFood(String food) {
    foodInPlate = food;
    System.out.println("Food is ready, notifying all");
    notifyAll();
  }

  public synchronized void eatFood() throws InterruptedException {
    while (foodInPlate.isEmpty()) {
      System.out.println("No food available, waiting...");
      wait();
    }
    System.out.println("Eating : "+foodInPlate);
    foodInPlate = "";
  }
}
