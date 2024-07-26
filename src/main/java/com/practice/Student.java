package com.practice;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private double salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Student(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o){
        if( this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Student student = (Student)o;
        return age == student.getAge() && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}
