package com.foxmo.leetcode.dynamic_plan.qiuzhao;

public class Demo_279_完全平方数 {
    public static void main(String[] args) {
        System.out.println(numSquares(1));
    }

    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i * i <= n ; i++) {
            for (int j = i * i; j < dp.length; j++) {
                dp[j] = Math.min(dp[j],dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }
}
