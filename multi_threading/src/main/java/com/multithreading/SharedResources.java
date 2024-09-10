package com.multithreading;

public class SharedResources {
    private int data;
    private boolean dataAvailable = false;

    public synchronized void produce(int value) {
        while (dataAvailable) {
            try {
                wait();
            }  catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        dataAvailable = true;
        System.out.println("Data Produced: " + value);
        notify();
    }

    public synchronized int consume(){
        while (!dataAvailable) {
            try{
                wait();
            }  catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        dataAvailable = false;
        System.out.println("Data Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable{
    private final SharedResources resources;

    public Producer(SharedResources resource){
        resources = resource;
    }

    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            resources.produce(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private final SharedResources resources;

    public Consumer(SharedResources resource){
        resources = resource;
    }

    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            resources.consume();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
