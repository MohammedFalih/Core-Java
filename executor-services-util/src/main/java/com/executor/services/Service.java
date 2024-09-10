package com.executor.services;

public class Service implements Runnable {

    int i;

    public Service(int i) {
        this.i = i;
    };

    @Override
    public void run() {
        System.out.println("In Thread: " + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}