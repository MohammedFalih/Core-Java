package com.executor_demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteMethods {

    public static void executeMethod(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run(){
                System.out.println("Executor Service with execute method..");
            }
        });
        executorService.shutdown();
    }

    public static void submitMethod(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run(){
                System.out.println("Executor Service with submit..");
            }  
        });
        executorService.shutdown();
    }

    public static void invokeAnyMethod(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables =  new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception{
                return "Task 1";
            }
        });

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });

        callables.add(new Callable<String>() {
           public String call() throws Exception {
            return "Task 3";
           } 
        });

        String result = null;
        try {
            result = executorService.invokeAny(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + result);
        executorService.shutdown();

    }

    public static void invokeAllMethod() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        List<Future<String>> futures = executorService.invokeAll(callables);
        for(Future<String> future:futures) {
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nExecutor Services and the methods..");
        ExecuteMethods.executeMethod();
        ExecuteMethods.submitMethod();
        ExecuteMethods.invokeAnyMethod();
        ExecuteMethods.invokeAllMethod();
    }
}
