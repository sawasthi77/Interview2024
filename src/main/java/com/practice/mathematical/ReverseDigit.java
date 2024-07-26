package com.practice.mathematical;

public class ReverseDigit {

    public static void main(String[] args) {
        reverseDigit( 18765432);
    }

    private static void reverseDigit(int num){
        int n = 0;
        int len = String.valueOf(num).length() - 1;
        int reversedNumber = 0;

        while(num > 0){
            n = num % 10; //5 // 4
            int result = (int) (Math.pow(10, len) * n); //500 // 40
            reversedNumber = reversedNumber + result; // 500 540
            len --;
            num = num / 10; // 64
        }
        System.out.println(reversedNumber);
    }
}
