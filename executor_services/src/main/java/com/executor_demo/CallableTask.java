package com.executor_demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableTask implements Callable<String>{
    private String name;
    public CallableTask(String name) {
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Hello " + name;
    }
}

class App {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Mohammed Falih"));
       
        System.out.println("Task started---");
        String message =  welcomeFuture.get();
        System.out.println("Message: " + message);
        System.out.println("Main compeleted");
        executorService.shutdown();
    }
}
