package com.practice;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapBooksExample {
    public static void main(String[] args) {

        Developer o1 = new Developer();
        o1.setName("mkyong");
        o1.addBook("Java 8 in Action");
        o1.addBook("Spring Boot in Action");
        o1.addBook("Effective Java (3nd Edition)");

        Developer o2 = new Developer();
        o2.setName("zilap");
        o2.addBook("Learning Python, 5th Edition");
        o2.addBook("Effective Java (3nd Edition)");

        List<Developer> developerList = new ArrayList<>();
        developerList.add(o1);
        developerList.add(o2);

        Set<String> developerSet = developerList.stream()
                .flatMap( x -> x.getBook().stream()).collect(Collectors.toSet());
        developerSet.forEach(System.out::println);

    }
}
