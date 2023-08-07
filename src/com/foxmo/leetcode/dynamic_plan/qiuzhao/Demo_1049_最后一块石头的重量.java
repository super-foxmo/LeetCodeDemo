package com.foxmo.leetcode.dynamic_plan.qiuzhao;

import java.util.Scanner;

public class Demo_1049_最后一块石头的重量 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] stones = new int[m];
        for (int i = 0; i < m; i++) {
            stones[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            count += stones[i];
        }
        int size = count / 2;
        int[][] dp = new int[m][size + 1];
        for (int i = 0; i < size + 1; i++) {
            if (i >= stones[0]){
                dp[0][i] = stones[0];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < size + 1; j++) {
                if (j - stones[i] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i- 1][j - stones[i]] + stones[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < size  + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(count - 2 * dp[m - 1][size]);
    }
}
