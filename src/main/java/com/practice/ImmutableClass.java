package com.practice;

import java.util.HashMap;
import java.util.Map;

final public class ImmutableClass {
    private final String name;
    private final int id;
    private final Map<Teacher, String> metadata;

    public ImmutableClass(String name, int id, Map<Teacher, String> metadata) {
        this.name = name;
        this.id = id;
        Map<Teacher, String> tempMap = new HashMap<>();
        for (Map.Entry<Teacher, String> entry : metadata.entrySet()) {
            tempMap.put(new Teacher(entry.getKey()), entry.getValue());
        }
        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<Teacher, String> getMetadata() {
        Map<Teacher, String> tempMap = new HashMap<>();
        for (Map.Entry<Teacher, String> entry : metadata.entrySet()) {
            tempMap.put(new Teacher(entry.getKey()), entry.getValue());
        }
        return tempMap;
    }
}

class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher(Teacher other) {
        this.name = other.name;
        this.age = other.age;
    }
}
