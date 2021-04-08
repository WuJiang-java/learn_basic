package com.java.thread;

public class Demo01 {
    public static void main(String[] args) {

        MyThread myThread=new MyThread("新的线程！");
        myThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程!"+i);
        }



        //多线程
        //创建线程，重写线程中的run方法，线程锁，同步代码块
        //死锁，上线

    }

}
