package com.java.leetcode.simple;

/**
 * 若链表中的某个节点，既不是链表头节点，也不是链表尾节点，则称其为该链表的「中间节点」。
 *
 * 假定已知链表的某一个中间节点，请实现一种算法，将该节点从链表中删除。
 *
 * 例如，传入节点c（位于单向链表a->b->c->d->e->f中），将其删除后，剩余链表为a->b->d->e->f
 *
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {

        node.val=node.next.val;
        node.next=node.next.next;
    }

    public ListNode deleteNode(ListNode head, int val) {

        ListNode pre=new ListNode(0),first=head;
        pre.next=head;

        while(first!=null){
            if(first.val==val){
                first=first.next;
                pre.next=first;
            }else{
                pre=pre.next;
                first=first.next;
            }
        }

        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
