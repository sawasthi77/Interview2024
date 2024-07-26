package com.practice.mathematical;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static long factorial(int n) {
        long result = n;
        if( n == 0  || n == 1)
            return 1;
        else{
            if(n > 0){
                result = result * factorial(n - 1);
            }
        }
        return result;
    }
}
