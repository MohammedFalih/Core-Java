package com.java_dsa;

import java.util.ArrayList;
import java.util.List;

public class TheArrayList {
    public static void main(String[] args) {
        
        List<String> collections = new ArrayList<>();
        collections.add("List");
        collections.add("Set");
        collections.add("Map");
        collections.add("Queue");

        System.out.println("\nArrayLists");
        System.out.println("Size: " + collections.size());

        System.out.println(collections);
        System.out.println("Contains: " + collections.contains("Stack"));
        System.out.println("Contains: " + collections.contains("Set"));
        System.out.println("Index of: " + collections.indexOf("Map"));

        System.out.println("\nForeach: ");
        collections.forEach(System.out::println);


    }
}
