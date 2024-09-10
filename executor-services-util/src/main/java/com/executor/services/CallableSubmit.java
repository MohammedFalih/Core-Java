package com.executor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableSubmit {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future<String>> tasks = new ArrayList<>();
        
        ExecutorUtil.TimeDisplay();
        for(int i=0; i<=20; i++){
            tasks.add(executorService.submit(new CallableService(i)));
        }
        
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        ExecutorUtil.TimeDisplay();
        
        System.out.println("\n\nReturned from Callable: ");
        tasks.forEach(task -> {
            try {
                System.out.println(task.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }
}
