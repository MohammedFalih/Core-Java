package com.javacollections;
import java.util.*;;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> state_capitals = new HashMap<>();
        Map<String, String> country_capitals = new TreeMap<>();
        Map<String, Integer> bikes = new LinkedHashMap<>();
        Map<Integer, String> numbers = new TreeMap<>();
        Map<Integer, String> numbers2 = new TreeMap<>();

        state_capitals.put("Tamilnadu", "Chennai");
        state_capitals.put("Kerala", "Thiruvananthapuram");
        state_capitals.put("Karnataka", "Bengaluru");
        state_capitals.put("Maharastra", "Mumbai");

        country_capitals.put("USA", "Washington, D.C.");
        country_capitals.put("France", "Paris");
        country_capitals.put("India", "New Delhi");
        country_capitals.put("Germany", "Berlin");

        bikes.put("KTM Duke 390", 400000);
        bikes.put("Yamaha R3", 450000 );        
        bikes.put("Aprilia RS457", 480000 );
        bikes.put("TVS Apache RR310", 380000 );

        System.out.println("\nMap Implementation: ");
        System.out.println("\nHashMap: " + state_capitals);
        System.out.println("TreeMap: " + country_capitals);
        System.out.println("LinkedHashMap: " + bikes);

        System.out.println("\nIterations: ");
        System.out.println("For-each: ");

        for(String x : state_capitals.keySet()){
            System.out.println("Key: " + x + " and Value: " + state_capitals.get(x));
        }

        System.out.println("\nIterator: ");
        Iterator<Map.Entry<String, String>> entryIterator = country_capitals.entrySet().iterator();

        System.out.println("\nEntry Iterator: ");
        while (entryIterator.hasNext()) {
            System.out.println(entryIterator.next());
        }

        System.out.println("\nKey Iterator: ");
        Iterator<String> keyIterator = bikes.keySet().iterator();

        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }

        System.out.println("\nValue Iterator: ");
        Iterator<Integer> valuIterator = bikes.values().iterator();

        while (valuIterator.hasNext()) {
            System.out.println(valuIterator.next());
        }

        System.out.println("\nFor-Loop");
        for(Map.Entry<String, String> entry: country_capitals.entrySet()) {
            System.out.println(entry.getValue() + " is the capital of " + entry.getKey());
        }    
        
        System.out.println("\nPull_all Method: ");

        numbers.put(10, "ten");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        
        numbers2.put(15, "fifteen");
        numbers2.put(25, "twenty five");
        numbers2.put(35, "thirty five");
        numbers2.put(45, "forty five");

        System.out.println("Before put_all: ");
        System.out.println("numbers: " + numbers);
        System.out.println("numbers2: " + numbers2);

        numbers.putAll(numbers2);
        System.out.println("/nAfter put_all: " + numbers);

    }
}
