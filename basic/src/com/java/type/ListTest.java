package com.java.type;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("难过");
        System.out.println(list.contains("c"));
        System.out.println(list.contains("难过"));

        String s = new Date().toString();
        System.out.println(s);

        System.out.println((-3)%2);

        System.out.println((int)(3/2));
    }
}
