package com.java.test;

/**
 * TODO
 *
 * @author jiang_wu
 * @date 2021/11/4
 */
public class Test {
    public static void main(String[] args) {

        int[][] a={{0,0},{0,0},{0,0}};

        for (int i=0;i<=100;i=i+1){
            for (int j=0;j<=100;j=j+1){


                for(int m=0;m<=1;m=m+1){
                    for (int n=0;n<=1;n=n+1){


                        for (int k=0;k<=1;k=k+1){
                            for (int l=0;l<=1.00;l=l+1){

                                int ab=Math.abs(i*i-m*m)+Math.abs(j*j-n*n)+Math.abs(i*i-m*m+j*j-n*n);
                                int ac=Math.abs(i*i-k*k)+Math.abs(j*j-l*l)+Math.abs(i*i-k*k+j*j-l*l);

                                if (ab==ac){
                                    a[0][0]=i;
                                    a[0][1]=j;
                                    a[1][0]=m;
                                    a[1][1]=n;
                                    a[2][0]=k;
                                    a[2][1]=l;

                                    if(m!=k&&n!=l){
                                        System.out.println(ab+","+ac);
                                        System.out.println("("+a[0][0]+","+a[0][1]+")"+"("+a[1][0]+","+a[1][1]+")"+"("+a[2][0]+","+a[2][1]+")");
                                    }
                                }

                            }
                        }
                    }
                }

            }
        }


    }
}
