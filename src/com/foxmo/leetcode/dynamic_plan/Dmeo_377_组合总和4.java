package com.foxmo.leetcode.dynamic_plan;

public class Dmeo_377_组合总和4 {
    public static void main(String[] args) {
        System.out.println(combinationSum4(new int[]{1, 2, 3}, 4));
    }
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        //初始化dp
        dp[0] = 1;

        //排序
        for (int j = 0; j <= target; j++) { // 遍历背包容量
            for (int i = 0; i < nums.length; i++) { // 遍历物品
                if (j - nums[i] >= 0) dp[j] += dp[j - nums[i]];
            }
        }
        //打印dp
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[target];
    }
}
