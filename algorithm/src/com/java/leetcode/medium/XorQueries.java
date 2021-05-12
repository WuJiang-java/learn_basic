package com.java.leetcode.medium;

/**
 * 有一个正整数数组arr，现给你一个对应的查询数组queries，其中queries[i] = [Li,Ri]。
 *
 * 对于每个查询i，请你计算从Li到Ri的XOR值（即arr[Li] xor arr[Li+1] xor ... xor arr[Ri]）作为本次查询的结果。
 *
 * 并返回一个包含给定查询queries所有结果的数组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xor-queries-of-a-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class XorQueries {

    public int[] xorQueries(int[] arr, int[][] queries) {

        int count=0;
        int[] result=new int[queries.length];
        for (int[] query : queries) {
            int xOr=0;
            for (int i = query[0]; i <= query[1]; i++) {
                xOr^=arr[i];
            }
            result[count++]=xOr;
        }
        return result;
    }


    public int[] xorQueries1(int[] arr, int[][] queries) {

        int n=arr.length,m=queries.length;
        int[] sum=new int[n+1];
        for (int i = 1; i <= n; i++) {
            sum[i]=sum[i-1]^arr[i-1];
        }
        int[] ans=new int[m];
        for (int i = 0; i < m; i++) {
            int l=queries[i][0]+1,r=queries[i][1]+1;
            ans[i]=sum[r]^sum[l-1];
        }
        return ans;
    }
}


