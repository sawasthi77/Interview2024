package com.practice.mathematical;

import com.practice.EmployeeClass;
import org.example.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorMainClass {

    private void compareByAge(){
        Comparator<EmployeeClass> compareByAge =
                Comparator.comparing(EmployeeClass::getAge);
    }

    public static void main(String[] args) {

        EmployeeClass employeeClass1 = new EmployeeClass("Sam", "same123",123,22,"male");
        EmployeeClass employeeClass2 = new EmployeeClass("John", "john123",345,25,"male");
        EmployeeClass employeeClass3 = new EmployeeClass("Pam", "pam123",897,21,"female");

        List<EmployeeClass> employeeClassList = List.of(employeeClass1,employeeClass2, employeeClass3);

        EmployeeClass [] employeeClasses = {employeeClass1, employeeClass2, employeeClass3};

        List<EmployeeClass> sortedByAge =
                employeeClassList.stream().sorted(Comparator.comparing(EmployeeClass::getAge)).
                        collect(Collectors.toList());

        Arrays.sort(employeeClasses, Comparator.comparing(EmployeeClass::getEmail));

        Arrays.sort(employeeClasses, Comparator.comparing(EmployeeClass::getAge).thenComparing(EmployeeClass::getEmail));


    }
}
