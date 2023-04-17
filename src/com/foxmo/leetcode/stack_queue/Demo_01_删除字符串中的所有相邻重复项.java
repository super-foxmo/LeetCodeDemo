package com.foxmo.leetcode.stack_queue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Demo_01_删除字符串中的所有相邻重复项 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        char pre = ' ';
        for (int i = 0; i < chars.length; i++) {
            if (stack1.size() > 0 && stack1.peek() == chars[i]){
                pre = chars[i];
                stack1.pop();
            }else{
                if (pre != chars[i]){
                    stack1.push(chars[i]);
                }
            }
        }
        Stack<Character> stack2 = new Stack<>();
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            stack2.push(stack1.pop());
        }
        size = stack2.size();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(stack2.pop());
        }

        //abbbacbbcidimwnnoon

//        System.out.println(removeDuplicates("abbbacbbcidimwnnoon"));
    }

    public static String removeDuplicates2(String S) {
        //ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
        //参考：https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < S.length(); i++) {
            ch = S.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String str = "";
        //剩余的元素即为不重复的元素
        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }
}
