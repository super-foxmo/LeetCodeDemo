package com.foxmo.leetcode.stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo_225_队列实现栈 {
    private Queue<Integer> queue;
    private Queue<Integer> copyQue;

    public Demo_225_队列实现栈() {
        queue = new ArrayDeque<Integer>();
        copyQue = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int size = queue.size();
        for (int i = 1; i < size; i++) {
            copyQue.add(queue.poll());
        }
        int result = queue.poll();
        while(!copyQue.isEmpty()){
            queue.add(copyQue.poll());
        }
        return result;
    }

    public int top() {
        int size = queue.size();
        for (int i = 1; i < size; i++) {
            copyQue.add(queue.poll());
        }
        int result = queue.poll();
        while(!copyQue.isEmpty()){
            queue.add(copyQue.poll());
        }
        queue.add(result);
        return result;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
