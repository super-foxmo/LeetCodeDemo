package com.foxmo.leetcode.stack_queue;

import java.util.ArrayDeque;

public class MyQueue {
    public static void main(String[] args) {

    }
    public ArrayDeque<Integer> deque;

    public MyQueue(){
        deque = new ArrayDeque<>();
    }

    public void poll(int val){
        if (!deque.isEmpty() && deque.peek() == val){
            deque.poll();
        }
    }

    public void add(int val){
        while(!deque.isEmpty() && deque.getLast() < val){
            deque.removeLast();
        }
        deque.add(val);
    }

    public int peek(){
        return deque.peek();
    }

    public int size(){
        return deque.size();
    }
}
