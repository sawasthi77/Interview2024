package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleJava8 {

    private int lengthOfLongestString(List<String> fruits){

        return fruits.stream().map(String::length).max(Comparator.naturalOrder()).get();
    }

    private void sortSalaryOfEmp(List<Employee> employees){
        employees.stream().sorted((e1, e2) -> (e2.getSalary() - e1.getSalary()))
                .limit(3).collect(Collectors.toList());
    }

    private void groupingByAge(List<Employee> employees){
        employees.stream().collect(Collectors.groupingBy(Employee::getId));
    }

    private void sumOfArrayList(List<Integer> integers){
        integers.stream().reduce(Integer::sum).get();
    }

    private void diffBetweenMapAndFlatMap(List<Employee> employees){

    employees.stream().map(emp -> emp.getId()).collect(Collectors.toList());

    employees.stream().flatMap( emp -> emp.getCities().stream()).collect(Collectors.toSet());

    }
}
