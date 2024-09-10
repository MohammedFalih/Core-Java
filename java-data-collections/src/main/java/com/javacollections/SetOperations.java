package com.javacollections;
import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(
            new Integer[] {1,2,3,4,5}
        ));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(
            new Integer[] {4,5,6,7,8}
        ));

        System.out.println("\na: " + a);
        System.out.println("b: " + b);

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("\nUnion of a and b: " + union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of a and b: " + intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference between a and b: " + difference);
    }
}
