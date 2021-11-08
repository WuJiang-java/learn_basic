package com.java.test;

/**
 * TODO
 *
 * @author jiang_wu
 * @date 2021/11/4
 */
public class Test1 {
    public static void main(String[] args) {

        double i=0.05,j=0.01,m=0.00,n=0.01,k=0.01,l=0.00;

        double ab=Math.abs(i*i-m*m)+Math.abs(j*j-n*n)+Math.abs(i*i-m*m+j*j-n*n);
        double ac=Math.abs(i*i-k*k)+Math.abs(j*j-l*l)+Math.abs(i*i-k*k+j*j-l*l);
        System.out.println(ab);
        System.out.println(ac);
    }
}
