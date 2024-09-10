package com.executor_demo;

public class Task extends Thread {
    private int number;
    public Task(int num){
        number = num;
    }

    public int getNumber() {
        return this.number;
    }

    public void run(){
        System.out.println("\nTask " + number + " started..");
        for(int i=number*100; i<=number*100+30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask " + number + " end..");

    }
}
