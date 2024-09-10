package com.executor_demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(2));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(8));
        executorService.execute(new Task(9));

        executorService.shutdown();
    }
}
