package com.foxmo.leetcode.stack_queue;


public class Demo_239_滑动窗口最大值 {
    public static void main(String[] args) {
        int[] ans = maxSlidingWindow(new int[]{7, 2, 4}, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        if (nums.length < k){
            return ans;
        }
        MyQueue myQueue = new MyQueue();
        int index = 0;
        for (int i = 0; i < k; i++) {
            myQueue.add(nums[i]);
        }
        ans[index] = myQueue.peek();
        index++;
        for (int i = k; i < nums.length; i++) {
            myQueue.add(nums[i]);
            myQueue.poll(nums[i - k]);

            ans[index] = myQueue.peek();
            index++;
        }
        return ans;
    }

//    static class MyQueue{
//        public ArrayDeque<Integer> deque;
//
//        public MyQueue(){
//            deque = new ArrayDeque<>();
//        }
//
//        public void poll(int val){
//            if (!deque.isEmpty() && deque.peek() == val){
//                deque.poll();
//            }
//        }
//
//        public void add(int val){
//            while(!deque.isEmpty() && deque.getLast() < val){
//                deque.removeLast();
//            }
//            deque.add(val);
//        }
//
//        public int peek(){
//            return deque.peek();
//        }
//
//        public int size(){
//            return deque.size();
//        }
//    }
}
