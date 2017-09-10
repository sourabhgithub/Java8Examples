package com.java8.model;

import java.util.Optional;

public class PrimeMinister {
  String name;
  Optional<Long> salary;

  public PrimeMinister() {}

  public PrimeMinister(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Optional<Long> getSalary() {
  return this.salary;}

  public void setSalary(Optional<Long> salary) {
  this.salary = salary;}
  
  
}
