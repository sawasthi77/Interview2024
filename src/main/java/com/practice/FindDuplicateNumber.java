package com.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int a[] = {1,4,5,2,12,34,2,11};
        System.out.println("Duplicate Number " + findDuplicateNumber(a));
    }
    private static int findDuplicateNumber(int[] a){
        Map<Integer, Long> map = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int duplicate = map.keySet().stream().filter(x -> map.get(x) > 1).findFirst().orElse(0);

        map.keySet().stream().filter( x -> map.get(x) > 1).forEach(System.out::println);
        return duplicate;
    }
}

// Map<Integer, Long> map = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));