package com.java.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyRunnable r=new MyRunnable();
        service.submit(r);
        service.submit(r);
        service.submit(r);
    }
}
