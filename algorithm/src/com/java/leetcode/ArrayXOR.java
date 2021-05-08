package com.java.leetcode;

/**
 * 给你两个整数，n 和 start 。
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xor-operation-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ArrayXOR {
    public int xorOperation(int n, int start) {

        //初始化数组
        int[] nums=new int[n];
        int result=0;
        for (int i = 0; i < n; i++) {
            nums[i]=start+2*i;
            //进行异或运算
            result=result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayXOR arrayXOR=new ArrayXOR();
        int i = arrayXOR.xorOperation(1, 7);
        System.out.println(i);
    }
}
