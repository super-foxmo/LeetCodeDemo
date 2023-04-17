package com.foxmo.leetcode.stack_queue;

import java.util.Stack;

public class Demo_20_有效的括号 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    public static boolean isValid(String s) {
        int length = s.length();
        if (s == null || length == 0 || length % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '('){
                stack.push(')');
            }else if (c == '['){
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }else if (!stack.empty() && c == stack.peek()){
                stack.pop();
            }else if(stack.empty() || c != stack.peek()){
                return false;
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
