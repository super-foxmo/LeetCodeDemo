package com.foxmo.leetcode.list;

/*给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。*/

public class Demo_206_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
