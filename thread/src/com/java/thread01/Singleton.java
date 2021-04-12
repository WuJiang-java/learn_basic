package com.java.thread01;

/**
 * 双重校验锁实现单例模式
 */
public class Singleton {

    //volatile是线程同步的轻量级实现，性能比synchronized快，但是只能用于修饰变量
    private volatile static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getUniqueInstance(){
        //判断对象是否实例化过，没有实例化才进入加锁代码
        if(uniqueInstance==null){
            //类对象加锁
            synchronized (Singleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
