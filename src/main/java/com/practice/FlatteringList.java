package com.practice;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatteringList {

    public static void main(String[] args) {
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);

        List<List<Integer>> listOfList = Arrays.asList(oddList, evenList);
        List<Integer> flatList = listOfList.stream()
                .flatMap(Collection::stream).collect(Collectors.toList());

        Character[][] array = new Character[][]{{'a','b'},{'c','d'},{'e','f'}};
        // Stream of 2d array --> stream of 1d array( flat map) --> finally new character array
        // We converted 2d array to 1d character array.
        Character[] charArray = Arrays.stream(array).flatMap(Stream::of).toArray(Character[]::new);
        for(Character o : charArray){
            System.out.println(o);
        }
        Stream.of(charArray).filter(x -> !x.equals('a')).collect(Collectors.toList()).forEach( x -> System.out.println(x));
    }
}
