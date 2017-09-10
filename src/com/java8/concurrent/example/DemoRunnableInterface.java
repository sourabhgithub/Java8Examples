package com.java8.concurrent.example;

import java.util.concurrent.TimeUnit;

public class DemoRunnableInterface {

  public static void main(String[] args) {

    runRunnableTask();
  }

  private static void runRunnableTask() {
    Runnable task =
        () -> {
          try {
            String threadName = Thread.currentThread().getName();
            System.out.println("Foo" + threadName);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Bar" + threadName);
          } catch (InterruptedException ex) {
            ex.printStackTrace();
          }
        };

    /*task.run();*/

    Thread newThread = new Thread(task);

    newThread.start();

    System.out.println("Done");
  }
}
