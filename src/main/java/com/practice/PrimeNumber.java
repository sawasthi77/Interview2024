package com.practice;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(" Number entered is prime " + primeNumberOrNot(5));
    }

    private static boolean primeNumberOrNot(int num){
        if(num == 0 || num == 1)
            return false;
        else if (num == 2) {
            return true;
        } else {
            boolean isPrime = IntStream.rangeClosed(0, num/2).noneMatch(x -> num % x == 0);
            return isPrime;
        }
    }
}