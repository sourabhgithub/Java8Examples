package com.java8.functionalInterface.example;

import com.java8.model.Add;
import com.java8.model.Display;
import com.java8.model.Multiply;

public class Demo {

  public static void main(String[] args) {

    Display display = () -> "Functional interfact with no args";

    System.out.println(display.show());

    Multiply multiply = (int a) -> a * 10;

    System.out.println(multiply.multiply(20));
    
    
    Add add = (int a, int b) -> a+b;
    System.out.println( add.addData(10, 20));
    
    
  }
}
