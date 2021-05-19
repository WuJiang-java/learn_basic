package com.java.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 *给你一个数组candies和一个整数extraCandies，其中candies[i]代表第 i 个孩子拥有的糖果数目。
 *
 * 对每一个孩子，检查是否存在一种方案，将额外的extraCandies个糖果分配给孩子们之后，此孩子有 最多的糖果。注意，允许有多个孩子同时拥有 最多的糖果数目。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list=new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            Boolean flag=true;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies<candies[j]){
                    flag=false;
                    break;
                }
            }
            list.add(flag);
        }
        return list;
    }
}
