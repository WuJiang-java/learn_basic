package com.java.math;

/**
 * 四舍五入的数学函数
 */
public class RoundMath {
    public static void main(String[] args) {
        //在原有数的基础上+0.5然后向下取整
        long round = Math.round(1.5);
        System.out.println(round);
    }
}
