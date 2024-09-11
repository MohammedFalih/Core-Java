package com.java_dsa;

import java.util.LinkedHashSet;

public class TheLinkedHashSet {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        
        nums.add(21);
        nums.add(53);
        nums.add(11);
        nums.add(432);
        nums.add(213);
        nums.addLast(0);
        nums.addFirst(45);

        System.out.println("\nLinked HashSet: maintains the order in which they are inserted");
        System.out.println("Numbers: " + nums);
        System.out.println("Size: " + nums.size());
    }
}
