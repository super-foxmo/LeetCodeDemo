package com.foxmo.leetcode;

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
