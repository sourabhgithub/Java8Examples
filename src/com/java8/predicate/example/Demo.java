package com.java8.predicate.example;

import java.util.function.Predicate;

import com.java8.model.Student;
import com.java8.sample.data.ListSampleData;

public class Demo {

  public static void main(String[] args) {

    Predicate<Student> maleStudent = s -> s.age >= 20 && "male".equals(s.gender);
    
    
    ListSampleData.getStudentList().stream().map(s -> s.age >= 20 && "male".equals(s.gender) )
    
    
  }
  

}
