package com.foxmo.leetcode.dynamic_plan.qiuzhao;

import java.util.Scanner;

public class Demo_474_一和零 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] goods = new int[num][2];
        for (int i = 0; i < num; i++) {
            String string = scanner.next();
            int one = 0;
            int zore = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == '0') {
                    zore++;
                }else if (string.charAt(j) == '1') {
                    one++;
                }
            }
            goods[i][0] = zore;
            goods[i][1] = one;
        }

        //背包容量
        int m = scanner.nextInt();//0
        int n = scanner.nextInt();//1

        int[][] dp = new int[m + 1][n + 1];
        for (int k = 0; k < num; k++) {
            for (int i = m; i >= goods[k][0]; i--) {
                for (int j = n; j >= goods[k][1]; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i - goods[k][0]][j - goods[k][1]] + 1);
                }
            }
        }
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
