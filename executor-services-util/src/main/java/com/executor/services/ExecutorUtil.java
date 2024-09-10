package com.executor.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorUtil {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorUtil.TimeDisplay();
        for(int i=0; i<=25; i++){
            es.execute(new Service(i));
        }        
        es.shutdown();
        es.awaitTermination(20, TimeUnit.SECONDS);
        ExecutorUtil.TimeDisplay();
    }

    public static void TimeDisplay() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH-mm-ss");
        String formattedTime = formatter.format(time);
        System.out.println("Time: " + formattedTime);
    }
}
