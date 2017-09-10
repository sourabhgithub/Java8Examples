package com.java8.model;

import java.util.function.Function;

public class Student {
  public String name;
  public int age;
  public String gender;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public Student(int age,String gender) {
    this.age = age;
    this.gender = gender;
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String customShow(Function<Student, String> fun) {

    return fun.apply(this);
  }
}
