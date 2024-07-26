package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateString {
    public static void main(String[] args) {

    }

    private static void palindromeString(String s){
        s.chars().mapToObj(Character::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1L).map(Map.Entry::getKey).collect(Collectors.toList());
        s.chars().mapToObj(Character::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1L).map(Map.Entry::getKey).findFirst().get();
        s.chars().mapToObj(Character::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter( x -> x.getValue() > 1L).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
