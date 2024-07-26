package com.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, Integer> modifyingHashMap = unmodifiedHashMap();
        modifyingHashMap.put("Four", 4);
        System.out.println(modifyingHashMap);

    }

    private static Map<String, Integer> unmodifiedHashMap(){

        return Map.of("One", 1, "two", 2, "three", 3);
    }
}
