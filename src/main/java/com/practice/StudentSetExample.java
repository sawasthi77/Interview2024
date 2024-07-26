package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentSetExample {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(" Enter Student name or 'exit' to finish: ");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("exit")){
                break;
            }

            System.out.println("Enter Student age");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Employee Salary");
            double sal = Double.parseDouble(sc.nextLine());

            Student student = new Student(name, age, sal);
            if(!students.add(student)){
                System.out.println("Duplicate student not added: " + student);
            }else{
                System.out.println(" Student added: " + student);
            }
        }

    }
}
