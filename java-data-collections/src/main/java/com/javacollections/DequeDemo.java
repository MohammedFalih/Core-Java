package com.javacollections;

import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.List;

public class DequeDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(20);
        deque.push(40);
        deque.push(60);
        deque.push(80);

        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        System.out.println("Deque: ");
        System.out.println(deque);
        System.out.println(deque.peek());

        System.out.println("Stack: ");
        System.out.println(stack);
        System.out.println(stack.peek());

        /*
         * Deque stream with LIFO so it is better to use Deque
         * when it is Single threaded environment
         */

        List<Integer> list1 = stack.stream().collect(Collectors.toList());
        System.out.println("Using stack: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        List<Integer> list2 = deque.stream().collect(Collectors.toList());
        System.out.println("\nUsing deque: ");
        for (int j = 0; j < list2.size(); j++) {
            System.out.print(list2.get(j) + " ");
        }
        System.out.println();
    }
}
