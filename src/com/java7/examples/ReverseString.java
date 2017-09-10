package com.java7.examples;

import java.util.Scanner;

public class ReverseString {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String myString = scanner.next();
    scanner.close();
    
    StringBuilder string  = new StringBuilder();
    string.append(myString);
    
    string.reverse();
    
    System.out.println(string.toString()); 
    
    

  }
}
