package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {

        List<String> values = new ArrayList<>();
        values.add("Java");
        values.add("Python");
        values.add(".Net");
        values.add("Python");
        values.add(".Net");

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);
        for (String s: removeDuplicates)
            System.out.println(s);
    }
}
