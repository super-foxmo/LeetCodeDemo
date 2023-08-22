package com.foxmo.leetcode.dynamic_plan.qiuzhao;

public class Demo_377_组合总和 {
    public int combinationSum4(int[] nums, int target) {
        int num = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int j = 0 ;j < dp.length;j++){
            for(int i = 0;i < num;i++){
                if(j - nums[i] >= 0){
                    dp[j] = dp[j] + dp[j - nums[i]];
                }

            }
        }
        return dp[target];
    }
}
