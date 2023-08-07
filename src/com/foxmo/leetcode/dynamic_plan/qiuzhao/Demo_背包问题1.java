package com.foxmo.leetcode.dynamic_plan.qiuzhao;

import java.util.Scanner;

public class Demo_背包问题1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] goods = new int[num][2];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                goods[i][j] = scanner.nextInt();
            }
        }
        int size = scanner.nextInt();
        int[][] dp = new int[num][size + 1];
        for (int i = 0; i < size + 1; i++) {
            if (i >= goods[0][0]){
                dp[0][i] = goods[0][1];
            }
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < size + 1; j++) {
                if (j - goods[i][0] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - goods[i][0]] + goods[i][1]);
                } else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(goods[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("======================================");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < size + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
