package com.practice.mathematical;

public class DigitsSum {
    int isDigitSumPalindrome(int num){ //33
        int s = 0;
        while(num > 0){
            s += num % 10;
            num = num / 10;
        }
        return s;
    }
}
