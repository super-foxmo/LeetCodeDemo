package com.foxmo.leetcode.qiuzhao.dynamic_plan;

public class Demo_198_打家劫舍 {
    public static void main(String[] args) {

    }

    public static int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0],nums[1]);

        for(int j = 3;j < dp.length;j++){
            dp[j] = Math.max(dp[j - 1],dp[j - 2] + nums[j - 1]);
        }
        return dp[nums.length];

    }
}
