package com.java8.functionapply.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.model.Student;

public class Demo {

  public static void main(String[] args) {

    List<Student> list = new ArrayList<Student>();
    list.add(new Student("Ram", 20));
    list.add(new Student("Shyam", 22));
    list.add(new Student("Kabir", 18));
    
    Function<Student,String> stu = s -> s.getName() + "::" + s.getAge();

    list.forEach(student -> System.out.println(student.customShow(stu)));
    
    
  }
}
