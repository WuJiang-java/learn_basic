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

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {

        int sizeA = 0, sizeB = 0;
        ListNode firstA = headA, firstB = headB;
        //计算出两个链表的长度
        while (headA != null) {
            sizeA++;
            headA = headA.next;
        }
        while (headB != null) {
            sizeB++;
            headB = headB.next;
        }

        //将指针移到两者同一起点
        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA - sizeB; i++) {
                firstA = firstA.next;
            }
        } else {
            for (int i = 0; i < sizeB - sizeA; i++) {
                firstB = firstB.next;
            }
        }

        while (firstA!=null&&firstB!=null){
            if(firstA== firstB){
                return firstA;
            }
            firstA=firstA.next;
            firstB=firstB.next;
        }

        return null;

    }

}
