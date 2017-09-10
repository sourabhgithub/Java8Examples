package com.java8.concurrent.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DemoExecutorService {

  public static void main(String[] args) {

    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.submit(() -> {
      String name = Thread.currentThread().getName();
      System.out.println(name); 
    });
    
    
    try {
      System.out.println("Attempt to shut down executor" );
      executor.shutdown();
      executor.awaitTermination(5, TimeUnit.SECONDS);
      
    }catch(InterruptedException ex) {
      System.out.println("task interrupted" ); 
    } finally {
      if(!executor.isTerminated()) {
        System.out.println("Cancel non Finished Tasks" ); 
      }
      executor.shutdown();
      System.out.println("shutdown finished"); 
      
    }
  }
}
