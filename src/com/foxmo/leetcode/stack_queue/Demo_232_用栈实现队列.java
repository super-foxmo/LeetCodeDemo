package com.foxmo.leetcode.stack_queue;

import java.util.Stack;

public class Demo_232_用栈实现队列 {
    private Stack<Integer> put;
    private Stack<Integer> out;

    public Demo_232_用栈实现队列() {
        put = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    public void push(int x) {
        put.push(x);
    }

    public int pop() {
        if (out.empty()){
            while(!put.empty()){
                out.push(put.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (out.empty()){
            while(!put.empty()){
                out.push(put.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return put.empty() && out.empty();
    }
}
