package com.accolite;

public class SampleThread extends Thread {
  SampleThread() {

  }
  // Run
  @Override
  public void run() {
    System.out.println("I'm inside thread");
  }
}
