package com.java.sort;

/**
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array={2,4,5,6,1,2,3,4,5,99};
        int size=array.length;

        int index=1;

        while (index<=size-1){

            for(int j=index;j>0;j--){

                if(array[j]<array[j-1]) {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }else{
                    break;
                }

            }

            index++;

        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
