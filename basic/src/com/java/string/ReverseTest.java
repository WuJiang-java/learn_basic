package com.java.string;

public class ReverseTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("清晨我上马");
        sb.reverse();
        System.out.println(sb.toString());

        StringBuffer sbf=new StringBuffer("abcd");
        sbf.reverse();
        System.out.println(sbf.toString());
    }
}
