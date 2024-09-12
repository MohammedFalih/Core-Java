package com.java_dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TheHashMap {

    public static void main(String[] args) {

        Map<String, Integer> student_mark = new HashMap<>();

        student_mark.put("Falih", 100);
        student_mark.put("Khabib", 80);
        student_mark.put("Andrew", 93);
        student_mark.put("Ali", 93);

        System.out.println("\nHashMap: stores data in key-value pairs and does not maintain a order.");
        for (Entry<String, Integer> mark : student_mark.entrySet())
            System.out.println(mark.getKey() + " : " + mark.getValue());
    }
}
