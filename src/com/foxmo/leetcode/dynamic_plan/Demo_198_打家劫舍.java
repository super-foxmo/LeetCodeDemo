package com.foxmo.leetcode.dynamic_plan;

public class Demo_198_打家劫舍 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 10, 3, 2, 10, 2}));
    }

    public static int rob(int[] nums) {
        //初始化dp
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
