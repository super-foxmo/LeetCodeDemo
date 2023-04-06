package com.foxmo.leetcode.list;


import java.util.*;
import java.util.stream.Stream;

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

        ArrayList<Integer> list = new ArrayList<>();
        Stream<Integer> sorted = list.stream().sorted();
        Arrays.sort(new int[]{66,4,34,523,5,234});

        Stack<Integer> stack = new Stack<>();    //栈
        stack.push(1);
        stack.pop();
        stack.peek();
        stack.size();
        Queue<Integer> queue = new LinkedList<>();  // 单向队列
        queue.add(1);
        queue.poll();
        queue.peek();
        queue.size();
        Deque<Integer> deque = new LinkedList<>();  //双向队列
        deque.offer(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.contains(1);
        deque.poll();
        deque.peek();
        deque.size();
    }
}
