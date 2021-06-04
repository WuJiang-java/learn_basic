package com.java.leetcode.simple;

public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        for(ListNode a=headA;a!=null;a=a.next){
            for(ListNode b=headB;b!=null;b=b.next){
                if(a.equals(b)) return a;
            }
        }
        return null;
    }
}
