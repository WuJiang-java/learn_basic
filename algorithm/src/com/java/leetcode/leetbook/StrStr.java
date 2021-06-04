package com.java.leetcode.leetbook;

/**
 * 实现strStr()函数。
 *
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
 */
public class StrStr {

    public int strStr(String haystack, String needle) {

        int h=haystack.length(),n=needle.length();
        char[] hChars=haystack.toCharArray(),nChars=needle.toCharArray();
        //原始串的起始点
        for(int i=0;i<=h-n;i++){
            //从原串的起始点和匹配串的首位开始尝试匹配
            int a=i,b=0;
            while(b<n&&hChars[a]==nChars[b]){
                a++;
                b++;
            }
            if(b==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        StrStr str=new StrStr();
        str.strStr("mississippi","issip");
    }
}
