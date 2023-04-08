package com.foxmo.leetcode.dynamic_plan;

import java.util.Scanner;

public class Demo_04_01背包问题滚动数组 {
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
        //初始化dp: dp[i]含义：容量为i的背包最大物品价值
        int[] dp = new int[weight + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 0;
        }
        //遍历dp赋值
        for (int i = 0; i < num; i++) {
            for (int j = weight; j > 0; j--) {	//防止物品重复添加
                if(j - list[i][0] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - list[i][0]] + list[i][1]);
                }
            }
        }
        //遍历dp
        for (int d = 0; d < dp.length; d++) {
            System.out.print(dp[d] + "  ");
        }
        scanner.close();
    }
}
