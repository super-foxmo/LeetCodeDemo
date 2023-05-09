package com.foxmo.leetcode.dynamic_plan;

public class Demo_70_爬楼梯 {
    public int climbStairs(int n) {
        //爬楼梯方式
        int[] m = new int[]{1,2};
        //初始化dp
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {  //遍历背包
            for (int j = 0; j < m.length; j++) {    //遍历物品
                if (i >= m[j]){
                    dp[i] += dp[i - m[j]];
                }
            }
        }
        return dp[n];
    }
}
