package com.foxmo.leetcode.dynamic_plan;

public class Demo_279_完全平方数 {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

    public static int numSquares(int n) {
        //初始化dp
        int[] dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        int temp = 0;
        for (int i = 1; i * i <= n; i++) {
            temp = i * i;
            for (int j = temp; j <= n; j++) {
                if (dp[j - temp] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - temp] + 1);
                }
            }
        }
        return dp[n];
    }

}
