package com.java8.sample.data;

import java.util.ArrayList;
import java.util.List;

import com.java8.model.Student;

public class ListSampleData {

  public static List<Student> getStudentList() {

    List<Student> studentList = new ArrayList<Student>();
    studentList.add(new Student("Ram", 20));
    studentList.add(new Student("Shyam", 22));
    studentList.add(new Student("Kabir", 18));
    studentList.add(new Student("me", 18));
    studentList.add(new Student("all", 18));
    studentList.add(new Student("all", 18));
    

    return studentList;
  }
}
