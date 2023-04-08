package com.foxmo.leetcode.dynamic_plan;

import java.util.Iterator;
import java.util.Scanner;

public class Demo_01_不同路径 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        int line = scanner.nextInt();
        int[][] dp = new int[column][line];
        //初始化列表
        for (int i = 0; i < column; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < line; i++) {
            dp[0][i] = 1;
        }
        //遍历dp
        for (int i = 1; i < column; i++) {
            for (int j = 1; j < line; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        //打印dp
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
