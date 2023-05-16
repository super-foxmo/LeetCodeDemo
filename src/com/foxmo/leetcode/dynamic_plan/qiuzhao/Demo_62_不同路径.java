package com.foxmo.leetcode.dynamic_plan.qiuzhao;

import java.util.Scanner;

public class Demo_62_不同路径 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] classboard = new int[m][n];
        // 初始化
        for (int i = 0; i < n; i++) {
            classboard[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            classboard[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                classboard[i][j] = classboard[i - 1][j] + classboard[i][j - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(classboard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
