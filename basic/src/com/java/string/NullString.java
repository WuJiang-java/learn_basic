package com.java.string;

public class NullString {
    public static void main(String[] args) {
        Object str1=null;
        String nullStr=(String)str1;
        //编译报错
        //String nullStr2=str1.toString();
        System.out.println(nullStr);
    }
}
