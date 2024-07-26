package com.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumArray {

    public static void main(String[] args) {

        int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
        int sumValue = Arrays.stream(a).boxed().mapToInt(x -> x).sum();
        int anotherSumValue = Arrays.stream(a).sum();
        System.out.println(anotherSumValue);
        int sum = Arrays.stream(a).boxed().reduce(0, Integer::sum);
        int anotherSum = Arrays.stream(a).reduce(0, Integer::sum);
        System.out.println(anotherSum);

        List<String> names = Arrays.asList("Java", "Spring", "JPA", "Java", "Cloud", "JPA");
        Map<String, Long> namesCount = names.stream().filter(x -> Collections.frequency(names, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
