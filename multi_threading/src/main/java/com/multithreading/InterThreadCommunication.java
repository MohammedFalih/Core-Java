package com.multithreading;

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Thread producerThread = new Thread(new Producer(resources));
        Thread consumerThread = new Thread(new Consumer(resources));

        producerThread.start();
        consumerThread.start();
    }
}
