package com.practice;

public class EmployeeClass {
    private String name;
    private String email;
    private Integer salary;
    private Integer age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EmployeeClass(String name, String email, Integer salary, Integer age, String gender) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }
}
