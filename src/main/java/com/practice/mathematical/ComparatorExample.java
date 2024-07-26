package com.practice.mathematical;

import com.practice.EmployeeClass;

import java.util.Comparator;

public class ComparatorExample implements Comparator<EmployeeClass> {
    @Override
    public int compare(EmployeeClass o1, EmployeeClass o2) {

        int nameCompare = o1.getName().compareTo(o2.getName());

        int ageCompare = o1.getAge().compareTo(o2.getAge());

        return nameCompare == 0 ? ageCompare : nameCompare;
    }
}
