package com.foxmo.leetcode.dynamic_plan.qiuzhao;

public class Demo_322_零钱兑换 {
    public static void main(String[] args) {
        int i = coinChange(new int[]{2}, 3);
        System.out.println(i);
    }

    public static int coinChange(int[] coins, int amount) {
        int num = coins.length;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1;i < dp.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i = 0;i < num;i++){
            for(int j = coins[i];j < dp.length;j++){
                if (dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j - coins[i]] + 1);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
    }
}
