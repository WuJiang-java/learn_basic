package com.java.leetcode.medium;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 */
public class SortList {

    public ListNode sortList(ListNode head) {

         if(head.next==null){
             return head;
         }
        if(head.next.val<head.val){

            head.next=sortList(head.next);
            return head;
        }
        return head;
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
