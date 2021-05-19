package com.java.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 给你一个二维矩阵 matrix 和一个整数 k ，矩阵大小为m x n 由非负整数组成。
 *
 * 矩阵中坐标 (a, b) 的 值 可由对所有满足 0 <= i <= a < m 且 0 <= j <= b < n 的元素 matrix[i][j]（下标从 0 开始计数）执行异或运算得到。
 *
 * 请你找出matrix 的所有坐标中第 k 大的值（k 的值从 1 开始计数）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KthLargestValue {

    public int kthLargestValue(int[][] matrix, int k) {

        int row=matrix.length;
        int col=matrix[0].length;

        //所有行累计求异或
        for (int i = 1; i < col; i++) {
            for (int j=0;j<row;j++){
                matrix[j][i]=matrix[j][i]^matrix[j][i-1];
            }
        }

        //所有列累计求异或
        for (int j=1;j<row;j++){
            for (int i=0;i<col;i++){
                matrix[j][i]=matrix[j][i]^matrix[j-1][i];
            }
        }

        //将所有数据添加进数组
        List<Integer> list=new ArrayList<>(row+col);
        for (int j=0;j<row;j++){
            for (int i=0;i<col;i++){
                list.add(matrix[j][i]);
            }
        }

        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        return list.get(k - 1);
    }

    public static void main(String[] args) {

        KthLargestValue kthLargestValue = new KthLargestValue();
        int i = kthLargestValue.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 1);
        System.out.println(i);
    }
}
