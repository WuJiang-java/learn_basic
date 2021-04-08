package com.java.thread;

import com.java.test.Test;

public class DeadLock {
    public static void main(String[] args) {
        System.out.println("公元1954年");

        TestThread1 thread1=new TestThread1("线程1");
        TestThread1 thread2=new TestThread1("线程2");
        TestThread1 thread3=new TestThread1("线程3");
        TestThread1 thread4=new TestThread1("线程4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}

class TestThread1 extends Thread{

    public TestThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();

        System.out.println(getName()+"线程开启");
    }
}
