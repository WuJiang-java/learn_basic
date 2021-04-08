package com.java.thread;

public class MyThread extends Thread{
    //定义指定线程名称的构造方法
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+":正在执行！"+i);
        }
    }
}