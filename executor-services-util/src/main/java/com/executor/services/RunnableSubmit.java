package com.executor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunnableSubmit {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        List<Future<String>> tasks = new ArrayList<>();

        ExecutorUtil.TimeDisplay();
        for(int i=1; i<=50; i++){
            tasks.add((Future<String>) es.submit(new Service(i)));
        }

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("========================");
        for(Future<String>task : tasks) {
            System.out.println(task.get());     // returns null coz submit with runnable will return null
        }
        ExecutorUtil.TimeDisplay();
    }
}
