package com.java8.concurrent.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class DemoCallableFuture {

  public static void main(String[] args) throws Exception {

    Callable<Integer> task =
        () -> {
          try {
            TimeUnit.SECONDS.sleep(1);
            return 123;
          } catch (InterruptedException e) {
            throw new IllegalStateException("task interrupted", e);
          }
        };
       
      ExecutorService executor = Executors.newFixedThreadPool(1);
      Future<Integer> future = executor.submit(task);
      executor.shutdownNow();
      
      Integer integerValues = future.get();
      
     
      System.out.println(future.isDone() );
      
      
      System.out.println("future done? " + future.isDone());
      
      System.out.println(integerValues ); 
      
      
      
      
      
      
      
        
  }
}
