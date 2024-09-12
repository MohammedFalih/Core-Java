package com.java_dsa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TheLinkedHashMap {

    public static void main(String[] args) {

        Map<Integer, String> blocks = new LinkedHashMap<>();
        blocks.put(233, "Block A");
        blocks.put(134, "Block B");
        blocks.put(568, "Block C");

        System.out.println("\nLinkedHashMap: stores data in key-value pairs and maintains the order in which it is inserted.");
        for (Entry<Integer, String> block : blocks.entrySet())
            System.out.println(block.getKey() + " : " + block.getValue());

        System.out.println("\nMethods: ");
        System.out.println("contains key: " + blocks.containsKey(454));
        System.out.println("contains key: " + blocks.containsKey(233));

        System.out.println("contains value: " + blocks.containsValue("block A"));
        System.out.println("contains value: " + blocks.containsValue("Block A"));


    }
}
