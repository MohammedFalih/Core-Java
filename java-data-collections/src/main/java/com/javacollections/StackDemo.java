package com.javacollections;

import java.util.Stack;

public class StackDemo {

    static void stack_push(Stack<Integer> stack){
        System.out.println("Pushing Element: ");
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop Operation: ");

        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.println("popped: " + y);
        }
    }

    static void stack_peek(Stack<Integer> stack){
        System.out.println("Peek stack: " + stack.peek());
    }

    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = stack.search(element);

        if (pos == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found in the position: " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();
        Stack<String> carStack = new Stack<>();
        
        System.out.println("Size of the car stack: " + carStack.size());
        carStack.push("Fiesta");
        carStack.push("Octavia");
        carStack.push("Polo gti");        
        System.out.println("Size of the car stack: " + carStack.size());
        System.out.println(carStack);
        System.out.println("Popped Element: " + carStack.pop());
        System.out.println("Peeked Element: " + carStack.peek());
        System.out.println("Size of the car stack: " + carStack.size());

        System.out.println("\nInteger stack: ");
        stack_push(newStack);
        System.out.println(newStack);
        stack_pop(newStack);
        stack_push(newStack);
        stack_peek(newStack);
        stack_search(newStack, 2);
    }
}
