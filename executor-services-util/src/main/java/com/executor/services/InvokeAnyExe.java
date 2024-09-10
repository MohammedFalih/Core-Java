package com.executor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class InvokeAnyExe {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Callable<String>> futurelList = new ArrayList<>();
        futurelList.add(new CallableService(33));
        futurelList.add(new CallableService(44));
        futurelList.add(new CallableService(55));
        futurelList.add(new CallableService(88));      
        futurelList.add(new CallableService(70));
        futurelList.add(new CallableService(80));

        String str = es.invokeAny(futurelList);
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("=================");
        System.out.println(str);

    }
}
