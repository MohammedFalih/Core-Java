package com.java_dsa;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TheTreeMap {

    public static void main(String[] args) {
        
        Map<String, Integer> bikes = new TreeMap<>();
        bikes.put("KTM RC", 200);
        bikes.put("KTM Duke", 250);
        bikes.put("RE Classic", 350);
        bikes.put("Kawasaki Ninja", 300);
        bikes.put("Yamaha R3", 300);

        System.out.println("TreeMap: ");
        for(Entry<String, Integer> bike : bikes.entrySet()) {
            System.out.println("Key: " + bike.getKey() + " and value: " + bike.getValue());
        }
    }
}
