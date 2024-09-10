package com.executor_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        for(int i=0; i<=5; i++){
            int taskId = i;
            executorService.submit(() -> {
                System.out.println("Executing task " + taskId + " on thread " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}