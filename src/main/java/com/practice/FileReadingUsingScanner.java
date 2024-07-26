package com.practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReadingUsingScanner {

    void readFile(String path, String filename) throws IOException {

        FileInputStream inputStream = null;
        Scanner sc = null;
        try{
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream, "UTF-8");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            if(sc.ioException() != null){
                throw sc.ioException();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(inputStream != null){
                inputStream.close();
            }
            if(sc != null){
                sc.close();
            }
        }

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            while (br.readLine() != null){

            }
        }

        try(Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.forEach( line -> {

            });
        }
    }
}
