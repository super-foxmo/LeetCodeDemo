package com.foxmo.leetcode.dynamic_plan.qiuzhao;

public class Demo_518_零钱兑换 {
    public static void main(String[] args) {
        int change = change(5, new int[]{1, 2, 5});
    }

    public static int change(int amount, int[] coins) {
        int num = coins.length;
        int[] dp = new int[amount + 1];
        for(int i = 0;i < dp.length;i++){
            if(i % coins[0] == 0){
                dp[i] = 1;
            }
        }
        for(int i = 1;i < num;i++){
            for(int j = coins[i];j < dp.length;j++){
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
