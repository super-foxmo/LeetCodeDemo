package com.foxmo.leetcode.list;

public class Demo_142_环形链表 {
    public ListNode detectCycle(ListNode head) {
        ListNode pre = head,after = head,index;
        if (head == null || pre.next == null || after.next == null || after.next.next == null){
            return null;
        }
        pre = head.next;
        after = head.next.next;
        index = head;
        while(pre != after){
            if (pre.next == null || after.next == null || after.next.next == null){
                return null;
            }
            pre = pre.next;
            after = after.next.next;
        }
        while(index != pre){
            index = index.next;
            pre = pre.next;
        }
        return index;
    }
}
