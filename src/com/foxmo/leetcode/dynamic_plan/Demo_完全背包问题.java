package com.foxmo.leetcode.dynamic_plan;

import java.util.Scanner;

public class Demo_完全背包问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //商品数量
        int num = scanner.nextInt();
        int[][] list = new int[num][2];
        //每个商品的重量和价值
        for (int i = 0; i < num; i++) {
            int w = scanner.nextInt();
            int value = scanner.nextInt();
            list[i][0] = w; //重量
            list[i][1] = value; //价值
        }
        //背包重量
        int weight = scanner.nextInt();
        int[] dp = new int[weight + 1];
        //初始dp
        for (int i = list[0][0]; i < dp.length; i++) {
            int count = i / list[0][0];
            dp[i] = count * list[0][1];
        }

        for (int i = 0; i < num; i++) { //遍历物品
            for (int j = list[i][0]; j <= weight; j++) {    //遍历背包
                dp[j] = Math.max(dp[j],dp[j - list[i][0]] + list[i][1]);
            }
        }
        scanner.close();
        System.out.println(dp[weight]);
    }

}
