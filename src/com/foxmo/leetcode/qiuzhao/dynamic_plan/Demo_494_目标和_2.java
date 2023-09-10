package com.foxmo.leetcode.qiuzhao.dynamic_plan;

public class Demo_494_目标和_2 {
    public static void main(String[] args) {

    }

    public static int findTargetSumWays(int[] nums, int target) {
        int count = 0;
        for(int i = 0;i < nums.length;i++){
            count += nums[i];
        }
        if(count < Math.abs(target) || (count + Math.abs(target)) % 2 == 1){
            return 0;
        }
        int left = (count + Math.abs(target)) / 2;
        int[] dp = new int[left + 1];
        dp[0]  = 1;
        for(int i = 0;i < nums.length;i++){
            for(int j = left;j >= nums[i];j--){
                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }
        return dp[left];
    }

}
