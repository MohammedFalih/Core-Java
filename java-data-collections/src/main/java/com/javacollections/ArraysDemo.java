package com.javacollections;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] colors = new String[4];
        int[] numbers = {100,200,300,400};

        System.out.println("\nNumbers List: ");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.println("\nReverse Loop: ");
        for(int i=numbers.length - 1; i>=0; i--){
            System.out.println(numbers[i]);
        }
        
        colors[0] = "purple";
        colors[1] = "red";
        colors[2] = "yellow";
        colors[3] = "olive";

        System.out.println("\nToString: ");
        System.out.println(Arrays.toString(colors));

        System.out.println("\nFor each method: ");
        for(String color:colors){
            System.out.println(color);
        }

        System.out.println("\nFor loop: ");
        for(int i=0; i<colors.length;i++){
            System.out.println(colors[i]);
        }
        
        System.out.println("\nStream in Array: ");
        System.out.println("Two ways to define: ");
        Arrays.stream(colors).forEach(System.out::println);
        System.out.println();
        Arrays.stream(colors).forEach(color -> System.out.println(color));
    }
}
