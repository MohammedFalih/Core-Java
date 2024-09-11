package com.java_dsa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TheLinkedList {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

        List<String> segment200 = new LinkedList<>();
        segment200.add("Duke 200");
        segment200.add("RC 200");
        segment200.addFirst("Xpulse 200");
        segment200.add("NS 200");
        segment200.add("Classic 350");
        segment200.add("RS 200");

        
        System.out.println("\nLinkedList: ");
        System.out.println("Enhanced Loop: ");
        for (String bike : segment200) {
            System.out.println(bike);
        }
        
        System.out.println("\nLinked List methods");
        System.out.println("\nget: " + segment200.get(4));
        segment200.set(4, "RTR 200");
        System.out.println("After set: " + segment200.get(4));

        System.out.println("\nList Iterator: ");
        ListIterator iterator = segment200.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nConverting to Array");
        System.out.println("LinkedList: " + segment200);
        Object[] toArray = segment200.toArray();
        System.out.print("Converted from linkedlist to array: ");
        for(Object bike : toArray)
        System.out.print(bike + ", ");
        System.out.println();
        Arrays.stream(toArray).forEach(System.out::println);
    }
}
