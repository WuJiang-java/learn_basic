package com.java.leetcode.medium;

/**
 * 给你两个长度可能不等的整数数组nums1 和nums2。两个数组中的所有值都在1到6之间（包含1和6）。
 *
 * 每次操作中，你可以选择 任意数组中的任意一个整数，将它变成 1到 6之间 任意的值（包含 1和 6）。
 *
 * 请你返回使 nums1中所有数的和与nums2中所有数的和相等的最少操作次数。如果无法使两个数组的和相等，请返回 -1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/equal-sum-arrays-with-minimum-number-of-operations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MinOperations {

    public int minOperations(int[] nums1, int[] nums2) {

        int sum1=0,sum2=0;
        for (int i = 0; i < nums1.length; i++) {
            sum1+=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            sum2+=nums2[i];
        }
        if(sum1==sum2) return 0;
        //假设sum1<sum2的,不符合的话交换两个数之间的位置
        else if(sum1>sum2){
            return minOperations(nums2,nums1);
        }

        //sum1<sum2
        int diff=sum2-sum1;
        int res=0;
        int[] num=new int[6];
        for (int i = 0; i < nums1.length; i++) {
            num[6-nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            num[nums2[i]-1]++;
        }
        for (int i = 5; i >=1&&diff>0 ; i--) {
            while(diff>0&&num[i]>0){
                diff-=i;
                num[i]--;
                res++;
            }
        }
        return diff>0?-1:res;

    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,1,1,1,1,1};
        int[] nums2 = {6};
        MinOperations minOperations=new MinOperations();
        int i = minOperations.minOperations(nums1, nums2);
        System.out.println(i);
    }
}
