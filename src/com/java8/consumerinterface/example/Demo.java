package com.java8.consumerinterface.example;

import java.util.List;
import java.util.function.Consumer;

import com.java8.model.Student;
import com.java8.sample.data.ListSampleData;

public class Demo {

  public static void main(String[] args) {

    List<Student> list = ListSampleData.getStudentList();
    Consumer<Student> style = (Student s) -> System.out.println("Name : " + s.name);

    list.forEach(style);
  }
}
