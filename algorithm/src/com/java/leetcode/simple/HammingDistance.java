package com.java.leetcode.simple;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {

        int count=0;
        do{
            if(x%2!=y%2) count++;
            x/=2;
            y/=2;
        }while(x!=0||y!=0);
        return count;
    }

    public static void main(String[] args) {

        HammingDistance distance = new HammingDistance();
        int i = distance.hammingDistance(1, 4);
        System.out.println(i);
    }
}
