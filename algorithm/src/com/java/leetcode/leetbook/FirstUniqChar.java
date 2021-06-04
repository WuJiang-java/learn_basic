package com.java.leetcode.leetbook;

public class FirstUniqChar {

    public int firstUniqChar(String s) {

        //遍历字符串
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
