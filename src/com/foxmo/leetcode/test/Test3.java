package com.foxmo.leetcode.test;

import com.foxmo.leetcode.stack_queue.MyQueue;

import java.util.ArrayDeque;

public class Test3 {
//    public static void main(String[] args) {
//        int[] ans = maxSlidingWindow(new int[]{7, 2, 4}, 2);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }
//    }
    public static void main(String[] args) {

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        if (nums.length < k){
            return ans;
        }
        MyQueue myQueue = new MyQueue();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i < k - 1){
                myQueue.add(nums[i]);
                continue;
            }
            myQueue.add(nums[i]);
            if (myQueue.size() > k){
                myQueue.poll(nums[i - k]);
            }

            ans[index] = myQueue.peek();
            index++;
        }
        return ans;
    }

}
