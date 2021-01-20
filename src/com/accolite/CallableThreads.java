package com.accolite;

import java.util.concurrent.Callable;

public class CallableThreads implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = 0;
        for (int i = 0; i < 100000; i++) {
            num++;
        }
        System.out.println("Done callable "+num);
        Thread.sleep(5000);
        return "num ";
    }
}
