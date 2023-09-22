package com.foxmo.leetcode.qiuzhao.同盾;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int num = in.nextInt();
        int[] goods = new int[num];
        for (int i = 0; i < goods.length; i++) {
            goods[i] = in.nextInt();
        }
        int[] dp = new int[size + 1];
        for (int i = 0; i < num; i++) {
            for (int j = dp.length - 1; j >= goods[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j - goods[i]] + goods[i]);
            }
        }
        System.out.println(size - dp[size]);
    }
}
