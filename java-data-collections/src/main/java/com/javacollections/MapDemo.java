package com.javacollections;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> cities = new HashMap<>();

        cities.put(625516, "Cumbum");
        cities.put(620001, "Trichy");
        cities.put(625001, "Melur");
        cities.put(625001, "Madurai"); // data with same key will be overwritten with the latest value;

        System.out.println("\nMap Interface: ");
        System.out.println("Cities: "+ cities); 
        System.out.println("Size: " + cities.size());
        System.out.println("Get: " + cities.get(625516));
        System.out.println("Get if no match: " + cities.get(625510));
        System.out.println("ContainsKey: " + cities.containsKey(620001));
        System.out.println("ContainsKey: " + cities.containsKey(620002));
        System.out.println("Key set: " + cities.keySet());
        System.out.println("Values: " + cities.values());
        System.out.println("EntrySet: " + cities.entrySet());

        /*
         * getOrDefault(key, defaultValue): This method checks if the key exists in the 
         * map. If it does, it returns the corresponding value. If not, it returns the 
         * defaultValue without modifying the map.
         */
        System.out.println("GetorDefault: " + cities.getOrDefault(643001, "Ooty"));
        System.out.println("Size after adding: " + cities.size());

        System.out.println("\nIterating with entryset and foreach: ");
        cities.entrySet().forEach(System.out::println);
        System.out.println("Iterating with foreach: ");
        cities.forEach((pin, city) -> {
            System.out.println("Pincode is " + pin + " and city is " + city);
        });

    }
}
