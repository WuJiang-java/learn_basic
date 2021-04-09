package com.java.threadpool;

public class MyRunnable implements Runnable{

    /**
     * 重写run方法
     */
    @Override
    public void run() {

        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("教练来了"+Thread.currentThread().getName());
        System.out.println("教练走了");

    }
}
