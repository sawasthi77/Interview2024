package org.example;

public class Interview {

    // Write fibonacci series 0,1,1,2,3,5

    private void fibonacciSeries(int num){

        int temp = 0;
        int number = 0;

        if(num == 0 || num == 1){
            System.out.println(num);
        }
        else{
            for(int i = 0; i < num ; i ++){
                System.out.println(temp + i);
            }
        }
    }

    private void findDigitsOfIntegerNumber(int num){
        int n;
        int count = 0;

        while(num > 0){
            n = num / 10;
            count ++;
            num = n;
        }
    }
}
