package com.foxmo.leetcode.qiuzhao.去哪儿旅行;

public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param A       int整型 背包最大承载量
     * @param weights int整型一维数组 N件物品的重量
     * @param N       int整型 N件物品
     * @return int整型
     */
    public static int knapsack(int A, int[] weights, int N) {
        // write code here
        int[] dp = new int[A + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int j = A; j >= weights[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j - weights[i]] + weights[i]);
            }
        }
        int max = 0;
        for (int i : dp) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(knapsack(5, new int[]{1, 2, 3}, 3));
    }
}
