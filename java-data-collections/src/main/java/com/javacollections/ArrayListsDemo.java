package com.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListsDemo {
    public static void main(String[] args) {
        System.out.println("ArrayList: ");

        ArrayList<String> cars = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<>(5); // 5 is initial capacity or minimum capacity
        System.out.println("Before adding elements, the size is: " + numbers.size());

        // Immutable ArrayList:
        ArrayList<Integer> nums = new ArrayList<>(List.of(10, 20, 30));

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Dodge");
        cars.add("maruthi");

        System.out.println("\nWith stream: ");
        cars.stream().forEach(System.out::println);

        System.out.println("\nContains method in arraylist: ");
        System.out.println(cars.contains("tata"));
        System.out.println(cars.contains("Ford"));

        System.out.println("\nGet the element with get(): ");
        System.out.println(cars.get(3));

        System.out.println("\nSet element with set(): ");
        System.out.println(cars.set(2, "Bugatti"));

        // removing
        cars.remove(4);
        System.out.println("\nIterating with foreach: ");
        for (String icar : cars) {
            System.out.println(icar);
        }

        System.out.println("\nUsing Iterator: ");
        Iterator<String> car = cars.iterator();
        while (car.hasNext())
            System.out.println(car.next());

        System.out.println("\nInteger ArrayLists: ");
        for (int i = 0; i <= 5; i++) {
            numbers.add(i);
        }

        System.out.println("After adding elements, the size is: " + numbers.size());
        numbers.stream().forEach(System.out::println);

        System.out.println("\nIterating immutable arraylist: ");
        for (int num : nums) {
            System.out.println(num);
        }

        nums.clear();
        System.out.println("After clearing the nums: " + nums.size());

    }
}
