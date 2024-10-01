package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class MinMax {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int max = Arrays.stream(a).boxed().max(Comparator.naturalOrder()).get();
        int min = Arrays.stream(a).boxed().min(Comparator.reverseOrder()).get();
        System.out.println(max);

        int maxWo = Arrays.stream(a).boxed().reduce(Integer::max).get();
        int minWo = Arrays.stream(a).boxed().reduce(Integer::min).get();

        int secMax = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();

        int secMin = Arrays.stream(a).boxed().sorted().skip(1).findAny().get();

        Arrays.stream(a).boxed().max(Comparator.reverseOrder()).get();
        Arrays.stream(a).boxed().reduce(Integer::max).get();
    }
}
