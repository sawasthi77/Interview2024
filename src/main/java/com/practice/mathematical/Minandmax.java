package com.practice.mathematical;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalLong;

public class Minandmax {
    public static void main(String[] args) {
        long a[] = {1,2,3,4};
        System.out.println(getMinMax(a, 4));
    }

    static Pair getMinMax(long a[], long n)
    {
        OptionalLong max = Arrays.stream(a).max();
        OptionalLong min = Arrays.stream(a).min();
        System.out.println(max.getAsLong());
        System.out.println(min.getAsLong());
        return new Pair(max.getAsLong(), min.getAsLong());
    }
}

class Pair{
    long first,second;

    public long getFirst() {
        return first;
    }

    public void setFirst(long first) {
        this.first = first;
    }

    public long getSecond() {
        return second;
    }

    public void setSecond(long second) {
        this.second = second;
    }

    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
