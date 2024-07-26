package com.practice;

public class FibbonacciSeries {

    public static void main(String[] args) {
        printSeries(5);
    }
    private static void printSeries(int n){
        int a = 0;
        int b = 1;
        int sum = 0;

        if(n == 0 || n == 1){
            System.out.println(0);
        }
        else{
            System.out.print(a + " , " + b);
            for(int i = 2 ; i < n ; i++){
                sum = a + b;
                System.out.print(" , " + sum);
                a = b;
                b = sum;
            }


        }
    }
}
