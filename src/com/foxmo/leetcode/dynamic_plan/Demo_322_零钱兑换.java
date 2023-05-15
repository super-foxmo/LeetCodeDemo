package com.foxmo.leetcode.dynamic_plan;

public class Demo_322_零钱兑换 {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,4,9,16}, 12));
    }
    public static int coinChange(int[] coins, int amount) {
        //初始化dp
        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE){

                    dp[j] = Math.min(dp[j],dp[j - coins[i]] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
