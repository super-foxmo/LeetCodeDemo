package com.foxmo.leetcode.dynamic_plan;

public class Demo_518_零钱兑换2 {
    public static void main(String[] args) {
        System.out.println(change(4, new int[]{1, 2, 3}));
    }
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        //初始化dp
        dp[0] = 1;
        //组合
        for (int i = 0; i < coins.length; i++) {// 遍历物品
            for (int j = coins[i]; j <= amount; j++) { // 遍历背包容量
                dp[j] += dp[j - coins[i]];
            }
        }

        //排序
//        for (int j = 0; j <= amount; j++) { // 遍历背包容量
//            for (int i = 0; i < coins.length; i++) { // 遍历物品
//                if (j - coins[i] >= 0) dp[j] += dp[j - coins[i]];
//            }
//        }
        //打印dp
        for (int i : dp) {
            System.out.print(i + " ");
        }
        System.out.println();
        return dp[amount];
    }
}
