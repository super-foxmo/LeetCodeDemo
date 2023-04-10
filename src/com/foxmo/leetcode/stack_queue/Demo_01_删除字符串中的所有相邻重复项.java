package com.foxmo.leetcode.stack_queue;

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
        for (int i = 0; i < size; i++) {
            System.out.print(stack2.pop());
        }
        //abbbacbbcidimwnnoon
    }
}
