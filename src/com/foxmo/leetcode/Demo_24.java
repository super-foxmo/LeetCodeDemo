package com.foxmo.leetcode;

/*给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）*/

public class Demo_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode head1 = new ListNode();
        head1.next = head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode temp = head1;
        while(curr != null){
            temp.next = curr;
            prev.next = curr.next;
            curr.next = prev;
            temp = temp.next.next;
            if(temp.next == null){
                break;
            }
            prev = temp.next;
            if(prev.next == null){
                break;
            }
            curr = prev.next;
        }
        return head1.next;
    }

     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
