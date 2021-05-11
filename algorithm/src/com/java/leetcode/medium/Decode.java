package com.java.leetcode.medium;

/**
 * 给你一个整数数组perm，它是前n个正整数的排列，且n是个 奇数。
 *
 * 它被加密成另一个长度为 n - 1的整数数组encoded，满足encoded[i] = perm[i] XOR perm[i + 1]。比方说，如果perm = [1,3,2]，那么encoded = [2,1]。
 *
 * 给你encoded数组，请你返回原始数组perm。题目保证答案存在且唯一。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-xored-permutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Decode {

    public int[] decode(int[] encoded) {

        int len=encoded.length;
        int first=1;
        int[] perm=new int[len+1];
        //计算encoded数组中的最大值
        int max=0;
        for (int i = 0; i < encoded.length; i++) {
            max=Math.max(max,encoded[i]);
        }

        while(first<=max){
            int count=0;
            perm[0]=first;
            for(int i=0;i<len;i++){
                for (int j = 1;; j++) {
                    if((perm[i]^j)==encoded[i]){
                        perm[i+1]=j;
                        count++;
                    }
                    if(j>max){
                        break;
                    }
                }
            }
            if(count!=len){
                first++;
            }else{
                break;
            }

        }
        return perm;

    }

    public int[] decode1(int[] encoded) {

        int n=encoded.length+1;
        int[] ans=new int[n];
        //计算除了ans[i-1]之外的所有异或
        int a=0;
        for (int i = 0; i < n-1; i=i+2) {
            a^=encoded[i];
        }
        int b=0;
        for (int i = 1; i <=n ; i++) {
            b^=i;
        }
        ans[n-1]=a^b;
        for(int i=n-2;i>=0;i--){
            ans[i]=ans[i+1]^encoded[i];
        }
        return ans;
    }

    public static void main(String[] args) {

      Decode decode=new Decode();
        int[] decode1 = decode.decode1(new int[]{2, 6, 3, 4, 6, 4, 15, 1});
        for (int i : decode1) {
            System.out.println(i);
        }

//        int[] a={2,12,11,13,3,9,8,15,14};
//        for (int i = 0; i < a.length-1; i++) {
//            System.out.println(a[i]^a[i+1]);
//        }

    }
}
