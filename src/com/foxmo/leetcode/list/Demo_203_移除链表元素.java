package com.foxmo.leetcode.list;

/*给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。*/

public class Demo_203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(-1,head);
        ListNode index = pre;
        while(index.next != null){
            if(index.next.val == val){
                index.next = index.next.next;
            }else{
                index = index.next;
            }
        }
        return pre.next;
    }
}
