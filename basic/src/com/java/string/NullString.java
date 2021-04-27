package com.java.string;

/**
 * String声明的是不可变的对象，每次操作都会生成新的String对象，然后
 * 将指针指向新的String对象。
 */
public class NullString {
    public static void main(String[] args) {
        Object str1=null;
        String nullStr=(String)str1;
        //编译报错
        //String nullStr2=str1.toString();
        System.out.println(nullStr);
    }
}
