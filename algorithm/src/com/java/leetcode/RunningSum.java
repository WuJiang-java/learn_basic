package com.java.leetcode;

public class RunningSum {

    public int[] runningSum(int[] nums) {

        int len=nums.length;
        int[] sum=new int[len];
        sum[0]=nums[0];
        for (int i = 1; i < len; i++) {
            sum[i]=nums[i]+sum[i-1];
        }
        return sum;
    }

    public static void main(String[] args) {

        RunningSum sum=new RunningSum();
        int[] result = sum.runningSum(new int[]{1, 2, 3, 4});
        for (int i : result) {
            System.out.println(i);
        }
    }
}
