package com.multithreading;

class Table {
    synchronized void print(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
}

public class Synchronized {
    public static void main(String[] args) {
        Table table = new Table();

        Thread first_thread = new Thread() {
            public void run() {
                table.print(5);
            }
        };

        Thread second_thread = new Thread() {
            public void run() {
                table.print(8);
            }
        };

        first_thread.start();
        second_thread.start();
       
    }
}
