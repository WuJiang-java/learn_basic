package com.java.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 和一个整数 k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：
 *
 * 子数组大小 至少为 2 ，且
 * 子数组元素总和为 k 的倍数。
 * 如果存在，返回 true ；否则，返回 false 。
 *
 * 如果存在一个整数 n ，令整数 x 符合 x = n * k ，则称 x 是 k 的一个倍数。
 */
public class CheckSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {

        //前缀和+Set集合，同余定理
        int size=nums.length;
        int[] sum=new int[size+1];
        for(int i=1;i<=size;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        Set<Integer> set=new HashSet<>();
        for(int i=2;i<=size;i++){
            set.add(sum[i-2]%k);
            if (set.contains(sum[i]%k)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        CheckSubarraySum checkSubarraySum = new CheckSubarraySum();
        checkSubarraySum.checkSubarraySum(new int[]{23,2,4,6,7},6);
    }
}
