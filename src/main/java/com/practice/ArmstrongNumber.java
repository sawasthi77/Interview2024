package com.practice;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrongNumber(321));
    }

    private static boolean isArmstrongNumber(int num){
        int len = String.valueOf(num).length();
        int sum = String.valueOf(num).chars().map(ch -> Character.digit(ch, 10))
                .map(digit -> (int)Math.pow(digit,len)).sum();
        return sum == num;
    }

    private static boolean anotherNumberCheck(int num){
        int len = String.valueOf(num).length();
        int sum = String.valueOf(num).chars().map(ch -> Character.digit(ch, 10))
                .map(digit -> (int)Math.pow(digit, len)).sum();
        return sum == num;
    }
    }
