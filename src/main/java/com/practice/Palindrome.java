package com.practice;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(" 44 is palindrome " + isPalindrome(44));
    }

    private static boolean isPalindrome(int num){
        String value = String.valueOf(num);
        int len = value.length();
        boolean isPalindrome = IntStream.range(0 , len/2)
                .anyMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
        return isPalindrome;
    }
}
