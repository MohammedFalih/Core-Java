package com.java_dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TheHashSet {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        @SuppressWarnings("rawtypes")
        HashSet<ArrayList> customSet = new HashSet<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();

        numbers.add(20);
        numbers.add(13);
        numbers.add(40);
        numbers.add(9);
        numbers.add(9);     // does not store duplicate values

        numbers1.add(20);
        numbers1.add(16);
        numbers1.add(100);

        System.out.println("\nHashSet: ");
        System.out.println("HashSet: " + numbers); 
        System.out.println("Size: " + numbers.size());

        customSet.add(numbers1);
        System.out.println("Adding list to hashset: " + customSet);
    }
}
