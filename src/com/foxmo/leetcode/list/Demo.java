package com.foxmo.leetcode.list;


import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

//        HashSet<Object> set = new HashSet<>();
//        set.add();
//        set.size();
//        set.contains();
//        HashMap map = new HashMap<Integer>();
//        map.put();
//        map.get();
//        map.size();
//        map.containsKey();
//        map.containsValue()
//        new Array();
//        ArrayList<Object> list = new ArrayList<>();
//        list.add();
//        list.get();
//        list.size();
//        list.contains();
//
//        Math.max()
//
//
//        int num = 100;
//        String s = new String("" + num);
//        char[] chars = s.toCharArray();
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : set){

        }

    }
}
