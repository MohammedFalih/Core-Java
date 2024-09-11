package com.java_dsa;

import java.util.Arrays;

public class TheArray {
    public static void main(String[] args) {
        String[] brands = new String[5];
        int[] nums = {23,44,654,32,67};

        brands[0] = "Dodge";
        brands[1] = "Ferrari";
        brands[2] = "Nissan";
        brands[3] = "BMW";
        brands[4] = "Lambo";

        System.out.println("\nArrays");
        System.out.println("Length: " + brands.length);
        System.out.println(".toString: " + Arrays.toString(brands));
        System.out.println("Hashcode: " + brands.hashCode());

        System.out.println("\nIterating Arrays: ");
        System.out.println("\nstream: ");
        Arrays.stream(brands).forEach(System.out::println);

        System.out.println("\nforEach: ");
        for (String brand : brands) {
            System.out.print(brand + " ");
        }
        System.out.println();

        System.out.println("\nforloop: ");
        for(int i=0; i<brands.length; i++){
            System.out.print(brands[i] + " ");
        }
        System.out.println("\n\n");

        System.out.println("Integer array: ");
        System.out.println(nums.length);
    }
}
