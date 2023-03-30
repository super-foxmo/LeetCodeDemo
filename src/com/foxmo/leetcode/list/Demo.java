package com.foxmo.leetcode.list;

public class Demo {
    public static void main(String[] args) {
//        String str = "abc";
//        System.out.println(str.hashCode());
//        str = "123";
//        System.out.println(str.hashCode());

//        String str = new String("abc");
//        System.out.println(str.hashCode());
//        str = "123";
//        System.out.println(str.hashCode());

//        String s1 = "abc";
//        String s2 = "abc";
        String s1 = new String("abc");
        String s2 = new String("abcd");
        if (s1.equals(s2)){
            System.out.println("true");
        }

        StringBuffer str = new StringBuffer("abc");
        System.out.println(str.hashCode());
        str.append("d");
        System.out.println(str.hashCode());

        ListNode listNode = new ListNode(10);

        System.out.println("123" + listNode.val);
    }
}
