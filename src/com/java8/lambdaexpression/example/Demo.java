package com.java8.lambdaexpression.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.interfaces.Calculator;
import com.java8.model.Student;

public class Demo {

  public static void main(String[] args) {

    //   comparatorExampleSorting();
    //   usingLambdaExpresssoin();
  }

  private static void comparatorExampleSorting() {
    List<Student> list = new ArrayList<Student>();

    list.add(new Student("Ram", 20));
    list.add(new Student("Shyam", 22));
    list.add(new Student("Kabir", 18));

    System.out.println("Before Sorting");
    list.forEach(student -> System.out.println(student.getName() + " ::" + student.getAge()));

    Comparator<Student> comp = (Student s1, Student s2) -> s1.getName().compareTo(s2.getName());

    Collections.sort(list, comp);

    System.out.println("After Sorting");

    list.forEach(student -> System.out.println(student.getName() + " ::" + student.getAge()));
  }

  private static void usingLambdaExpresssoin() {
    Calculator calculator = (int a, int b) -> a + b;

    int add = calculator.add(5, 6);

    System.out.println(add);
  }
}
