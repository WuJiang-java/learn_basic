package com.java.sort;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array={2,4,5,6,1,2,3,4,5,99};
        int size=array.length;

        //用于存储每次迭代的最小值和下标索引
        int min;
        int minIndex;

        int index=0;

        while(index<size-1){

            min=array[index];
            minIndex=index;
            for (int i = index+1; i <=size-1; i++) {

                if(array[i]<min){
                    min=array[i];
                    minIndex=i;
                }

            }

            int temp=array[index];
            array[index]=array[minIndex];
            array[minIndex]=temp;
            index++;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
