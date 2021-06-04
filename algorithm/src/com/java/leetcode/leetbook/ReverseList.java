package com.java.leetcode.leetbook;

import java.util.List;

public class ReverseList {

    public ListNode reverseList(ListNode head) {

        //判空操作
        if(head==null||head.next==null) return head;

        ListNode next=null;
        ListNode pre=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }

        return pre;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
