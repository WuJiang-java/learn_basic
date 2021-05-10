package com.java.leetcode.medium;

import java.util.Arrays;

/**
 * 夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
 *
 * 商店中新到 n 支雪糕，用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
 *
 * 给你价格数组 costs 和现金量 coins ，请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-ice-cream-bars
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxIceCream {

    public int maxIceCream(int[] costs, int coins) {

        //将价格进行排序,冒泡排序时间消耗过高
/*        for (int i = 0; i < costs.length-1; i++) {
            for(int j=0;j<costs.length-1-i;j++){
                if(costs[j]>costs[j+1]){
                    int temp=costs[j];
                    costs[j]=costs[j+1];
                    costs[j+1]=temp;
                }
            }
        }*/
        Arrays.sort(costs);
        //计算能够买到雪糕的最大值
        int count=0;
        int sum=0;
        for (int i = 0; i < costs.length; i++) {
            sum+=costs[i];
            if(coins>=sum){
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxIceCream max=new MaxIceCream();
        int i = max.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7);
        System.out.println(i);
    }
}
