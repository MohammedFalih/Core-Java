package com.javacollections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        // FIFO - First in First out.
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Queue<Person> customer = new LinkedList<>();

        queue.add(50);
        queue.add(70);
        queue.add(60);
        queue.add(40);
        queue.add(30);
        queue.add(120);
        queue.add(140);

        customer.add(new Person("Falih", 21));
        customer.add(new Person("Azmin", 30));
        customer.add(new Person("Umar", 41));

        System.out.println("\nPriority Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
        System.out.println("Remove: " + queue.remove()); // returns exception if it is null
        System.out.println("Size: " + queue.size());
        System.out.println("poll: " + queue.poll()); // returns null if it is empty
        System.out.println("Size: " + queue.size());
        System.out.println("Head is: " + queue.peek());

        while(!queue.isEmpty()) {
            int num = queue.poll();
            System.out.println(num);
        }
        
        System.out.println(customer.size());
        System.out.println("\nPriority Queue: ");
        while (!customer.isEmpty()) {
            System.out.println(customer.poll());
        }
    }

    static record Person(String name, int age) { }
}
