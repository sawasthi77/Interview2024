package org.example;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n%i == 0 );
    }
}
