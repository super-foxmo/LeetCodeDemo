package com.foxmo.leetcode.dynamic_plan;

import org.junit.Test;

import java.util.Scanner;

public class Demo {
    @Test
    public void 斐波那契_509(){
        int[] dp = new int[11];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[10]);
    }

    @Test
    public void 爬楼梯_70(){
        int n = 10;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        for (int i : dp) {
            System.out.print(i);
            System.out.print("  ");
        }
    }

    @Test
    public void 最小花费爬楼梯_746(){
    }
    
    @Test
    public void 不同路径_62(){
        int m = 3,n = 7;
        int[][] dp = new int[m][n];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + "   ");
            }
            System.out.println();
        }
    }

    @Test
    public void 零一背包(){
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
        int[][] dp = new int[num][weight + 1];
        //初始化
        for (int i = 0; i < dp[0].length; i++) {
            if (i >= list[0][0]){
                dp[0][i] = list[0][1];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j - list[i][0] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - list[i][0]] + list[i][1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "   ");
            }
            System.out.println();
        }
    }

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
        int[][] dp = new int[num][weight + 1];
        //初始化
        for (int i = 0; i < dp[0].length; i++) {
            if (i >= list[0][0]){
                dp[0][i] = list[0][1];
            }
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j - list[i][0] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - list[i][0]] + list[i][1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
