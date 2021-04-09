package com.java.thread01;

public class ThreadTest {
    public static void main(String[] args) {
        //实例化对象
        MyThread my1=new MyThread("线程A");
        MyThread my2=new MyThread("线程B");
        Thread thread1=new Thread(my1);
        Thread thread2=new Thread(my2);
        thread1.start();
        thread2.start();

    }

}

/**
 * 实现Runnable接口，作为线程的实现类
 */
class MyThread implements Runnable{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(name+"运行："+i);
        }
    }
}
