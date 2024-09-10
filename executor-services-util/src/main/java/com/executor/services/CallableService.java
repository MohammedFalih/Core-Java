package com.executor.services;

import java.util.concurrent.Callable;

public class CallableService implements Callable<String> {

    int i;

    public CallableService(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        System.out.println("In thread: " + i);
        Thread.sleep(1000);
        return "from thread: " + i;
    }

}
