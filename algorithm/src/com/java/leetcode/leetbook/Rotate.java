package com.java.leetcode.leetbook;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Rotate {

    //该方法将会超时
    public void rotate(int[] nums, int k) {

        int size=nums.length;
        for(int i=0;i<k;i++){
            int temp=nums[size-1];
            for (int j=size-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
    }

    public void rotate1(int[] nums, int k){

        int length=nums.length;
        int[] temp=new int[length];

        for(int i=0;i<length;i++){
            temp[i]=nums[i];
        }
        for(int i=0;i<length;i++){
            nums[(i+k)%length]=temp[i];
        }
    }

    public static void main(String[] args) {

        Rotate rotate = new Rotate();
        int[] num={1,2,3,4,5,6,7};
        rotate.rotate(num,3);
        for (int i : num) {
            System.out.print(i);
        }
    }
}
