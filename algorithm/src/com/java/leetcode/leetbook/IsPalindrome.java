package com.java.leetcode.leetbook;

/**
 *请判断一个链表是否为回文链表。
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {

        ListNode fast=head,slow=head;
        //通过快慢指针找到链表的中点
        while(fast!=null&&fast.next!=null){

            fast=fast.next.next;
            slow=slow.next;
        }
        //链表的长度为奇数个
        if(fast!=null){
            slow=slow.next;
        }
        //反转后半部分链表
        slow=reserve(slow);

        fast=head;
        while (slow!=null){
            if(fast.val!= slow.val) return false;
            fast=fast.next;
            slow=slow.next;

        }

        return true;
    }

    public ListNode reserve(ListNode head){

        ListNode pre=null,next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
    //Line 15: error: boolean cannot be dereferenced
    //        while(fast!=null&&false.next!=null){
    //                               ^
}

