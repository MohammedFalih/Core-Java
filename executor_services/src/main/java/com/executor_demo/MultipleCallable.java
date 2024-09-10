package com.executor_demo;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<CallableTask> taskList = List.of(
            new CallableTask("Google"), 
            new CallableTask("Microsoft"), 
            new CallableTask("Amazon"), 
            new CallableTask("Meta"));

        List<Future<String>> results = executorService.invokeAll(taskList);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
