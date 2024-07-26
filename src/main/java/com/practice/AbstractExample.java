package com.practice;

abstract public class AbstractExample {
    abstract void printInfo();
}

class Employee extends AbstractExample{
    void printInfo(){
        String name = "Ken";
        int age = 22;
    }
}

class Base {
    public static void main(String[] args) {
        AbstractExample abstractExample = new Employee();
        abstractExample.printInfo();
    }
}


