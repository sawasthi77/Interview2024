package com.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "xyz.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while(br.readLine()!= null){

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }
}

// try(BufferedReader br = new BufferedReader(new FileReader(filename)))
