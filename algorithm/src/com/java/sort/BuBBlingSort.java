package com.java.sort;

/**
 * 冒泡排序
 */
public class BuBBlingSort {

    public static void main(String[] args) {
        int[] array={9,12,4,3,2,13,44,6,17,8};
        int size=array.length;

        int count=0;

        while(count<size-1){

            for (int i = 0; i < size-1-count; i++) {

                //冒泡交换相邻的两个元素
                if(array[i]>array[i+1]){
                    int temp;
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }

            count++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
