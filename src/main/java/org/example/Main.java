package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {5,2,8,3,1,1};

    fetchSecondLargestElement(numbers);
        System.out.println("************************");
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {4,5,6,7,8};
        fetchCommonElements(array1, array2);

        int [] array3 = {1,2,3,4,5};
        reverseArray(array3);
    }

    private static void reverseArray(int[] array3) {
        IntStream.range(0, array3.length / 2).forEach( i -> {
            int temp = array3[i];
            array3[i] = array3[array3.length - i - 1];
            array3[array3.length - i - 1] = temp;
        });
    }

    private static void fetchCommonElements(int[] array1, int[] array2) {

        List<Integer> integerList = Arrays.stream(array1).filter(num ->
                        Arrays.stream(array2).anyMatch(arr2Num -> arr2Num == num))
                .boxed().collect(Collectors.toList());
    }

    private static void fetchSecondLargestElement(int[] numbers) {
                Arrays.stream(numbers).distinct().sorted().skip(1).min().ifPresentOrElse(
                        value -> System.out.println("Second largest number will be " + value),
                        () -> new IllegalArgumentException());
    }
}