package com.foxmo.leetcode.qingXunYing;

public class Demo2 {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
        int left = 0,right = 0;
        int slow = 0,fast = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(fast < nums.length){
            count += nums[fast];
            if (count > 0){
                int temp = max;
                max = Math.max(max,count);
                if (max != temp){
                    left = slow;
                    right = fast;
                }
                ++fast;
            } else{
                count = 0;
                slow = fast + 1;
                fast = fast + 1;
            }
        }
        System.out.println("max : " + max);
        for (int i = left; i <= right; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
