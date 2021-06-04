package com.java.leetcode.simple;

/**
 *个数组的 异或总和 定义为数组中所有元素按位 XOR 的结果；如果数组为 空 ，则异或总和为 0 。
 *
 * 例如，数组 [2,5,6] 的 异或总和 为 2 XOR 5 XOR 6 = 1 。
 * 给你一个数组 nums ，请你求出 nums 中每个 子集 的 异或总和 ，计算并返回这些值相加之 和 。
 *
 * 注意：在本题中，元素 相同 的不同子集应 多次 计数。
 *
 * 数组 a 是数组 b 的一个 子集 的前提条件是：从 b 删除几个（也可能不删除）元素能够得到 a 。

 */
public class SubsetXORSum {

    //暴力dfs枚举子集
    int res=0;
    public int subsetXORSum1(int[] nums){

        if(nums.length==1) return nums[0];
        dfs(nums,0,0);
        return res;
    }

    public void dfs(int[] nums,int i,int xorSum){
        if(i==nums.length){
            res+=xorSum;
            return;
        }

        dfs(nums,i+1,xorSum^nums[i]);
        dfs(nums,i+1,xorSum);
    }

    public int subsetXORSum(int[] nums) {

        int size=nums.length;
        int[] xORSum=new int[size];
        int sum=nums[0];
        xORSum[0]=nums[0];
        for(int i=1;i<size;i++){
           xORSum[i]=nums[i]^xORSum[i-1];
           sum+=xORSum[i];
        }

        for(int i=0;i<=size-2;i++){
            for (int j=i+1;j<=size-1;j++){
                sum+=xORSum[i]^xORSum[j];
            }
        }
        return sum;
    }



    public static void main(String[] args) {

        SubsetXORSum subsetXORSum=new SubsetXORSum();
        subsetXORSum.subsetXORSum1(new int[]{5,1,6});
    }
}
