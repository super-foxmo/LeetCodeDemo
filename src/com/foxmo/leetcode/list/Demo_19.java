package com.foxmo.leetcode.list;

/*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。*/

public class Demo_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        int listLen = getListLen(head);
        if(listLen - n == 0){
            head = head.next;
            return head;
        }
        for (int i = 1; i < listLen - n; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp.next;
    }

    public static int getListLen(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
