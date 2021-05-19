package com.java.leetcode.medium;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 */
public class MyPow {

    public double myPow(double x, int n) {

        if(n>0){
            double y=myPow(x,n/2);
            return n%2==0?y*y:y*y*x;
        }else if(n<0){
            double y=myPow(x,n/2);
            return n%2==0?y*y:y*y*(1/x);
        }else{
            return 1;
        }
    }
}
