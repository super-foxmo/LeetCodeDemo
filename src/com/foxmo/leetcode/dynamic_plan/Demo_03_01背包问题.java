package com.foxmo.leetcode.dynamic_plan;

import java.util.Scanner;

public class Demo_03_01背包问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //商品数量
        int num = scanner.nextInt();
        int[][] list = new int[num][2];
        //每个商品的重量和价值
        for (int i = 0; i < num; i++) {
            int w = scanner.nextInt();
            int value = scanner.nextInt();
            list[i][0] = w;
            list[i][1] = value;
        }
        //背包重量
        int weight = scanner.nextInt();
        //初始化dp
        int[][] dp = new int[num][weight + 1];
        for (int i = 0; i < num; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= weight; i++) {
            if (i >= list[0][0]) {
                dp[0][i] = list[0][1];
            }
        }
        //遍历dp赋值
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= weight; j++) {
                if(j - list[i][0] >= 0) {
                    dp[i][j] = Math.max(dp[i -1][j],dp[i - 1][j - list[i][0]] + list[i][1]);
                }else {
                    dp[i][j] = dp[i -1][j];
                }

            }
        }
        //遍历dp
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= weight; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
