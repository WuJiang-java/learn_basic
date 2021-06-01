package com.java.leetcode.medium;

/**
 * 吃糖果
 */
public class CanEat {

    public boolean[] canEat(int[] candiesCount, int[][] queries) {

        int n=candiesCount.length;
        //前缀和
        long[] sum=new long[n];
        sum[0]=candiesCount[0];
        for(int i=1;i<n;i++){
            sum[i]=candiesCount[i]+sum[i-1];
        }

        int q=queries.length;
        boolean[] ans=new boolean[q];
        for(int i=0;i<q;i++){
            int[] query=queries[i];
            int favoriteType=query[0],favoriteDay=query[1],dailyCap=query[2];

            long x1=favoriteDay+1;
            long y1=(long)(favoriteDay+1)*dailyCap;
            long x2= favoriteType==0?1:sum[favoriteType-1]+1;
            long y2=sum[favoriteType];

            ans[i]= !(y1<x2||x1>y2);
        }

        return ans;
    }
}