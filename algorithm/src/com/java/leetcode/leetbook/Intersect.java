package com.java.leetcode.leetbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            boolean flag = map.containsKey(nums1[i]);
            if(!flag){
                map.put(nums1[i],1);
                continue;
            }
            int value=map.get(i);
            map.put(nums1[i],value+1);
        }

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }

        int[] ans=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
