package com.javacollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<>();
        bikes.add("KTM");
        bikes.add("Yamaha");
        bikes.add("Honda");
   
        System.out.println("\nBikes LinkedLists: ");
        System.out.println(bikes);

        System.out.println("\nAdding element with addFirst(): ");
        bikes.addFirst("Aprilia");
        System.out.println(bikes);

        System.out.println("\nGetting element with getFirst(): "+ bikes.getFirst());
        System.out.println("Getting element with getLast(): " + bikes.getLast());
        
        Collections.sort(bikes);
        System.out.println("Sorting: " + bikes);

    }
    
}
