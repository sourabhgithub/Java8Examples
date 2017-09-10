package com.java8.optional.example;

import java.util.Optional;

import com.java8.model.PrimeMinister;

public class Demo {

  public static void main(String[] args) {
   
    Optional<PrimeMinister> minister = Optional.of(new PrimeMinister());
    
    String name = minister.map(PrimeMinister ::getName).orElse("none");
    
    System.out.println(name); 
  }
}
 
