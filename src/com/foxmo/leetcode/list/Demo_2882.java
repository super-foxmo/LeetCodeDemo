package com.foxmo.leetcode.list;

/*给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。*/

public class Demo_2882 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA,b = headB;
        while(a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
