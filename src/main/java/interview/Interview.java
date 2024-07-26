package interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview {

    // fibonnacci, all even terms needs to be added and sum should not be greater than 4 million
    public static void main(String[] args) {

        getSeries(1000);
        //list.stream().filter(x -> x%2 ==0).reduce(0, (a,b) -> a+b );

    }

    private static void getSeries(Integer n){ // 0,1,1,2,3 // List<Integer>

        List<Integer> newInteger = new ArrayList<>();
        int a = 0;
        int  b =1;
        int sum = 0;

        if( n == 0){
            System.out.println(a);
        }
        if (n ==1){
            System.out.println(a + "," + b);
        }
        for(int i = 2 ; i<= n ; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}



