package com.java.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 *
 *
 */
public class FindMaxLength {

    public int findMaxLength(int[] nums) {

        int length=nums.length;
        int[] sum=new int[length+1];
        //前缀和
        for(int i=1;i<=length;i++){
            sum[i]=sum[i-1]+(nums[i-1]==0?-1:1);
        }
        int ans=0;
        //避免扩容
        Map<Integer,Integer> map=new HashMap<>(length);
        for (int i=2;i<=length;i++){
            if(!map.containsKey(sum[i-2])) map.put(sum[i-2],i-2);
            if(map.containsKey(sum[i])) ans=Math.max(ans,i-map.get(sum[i]));

        }
        return ans;
    }

    public static void main(String[] args) {

        FindMaxLength findMaxLength=new FindMaxLength();
        findMaxLength.findMaxLength(new int[]{0,1,0});
    }
}
