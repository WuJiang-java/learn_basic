package com.java.leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-good-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NumIdenticalPairs {

    public int numIdenticalPairs(int[] nums) {

        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
           for(int j=i+1;j< nums.length;j++){
               if(nums[i]==nums[j]) count++;
           }
        }
        return count;

    }

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));
        System.out.println(set.add(2));
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
