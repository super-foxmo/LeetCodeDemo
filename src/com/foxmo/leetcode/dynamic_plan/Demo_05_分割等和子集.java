package com.foxmo.leetcode.dynamic_plan;

import java.util.Iterator;
import java.util.Scanner;

public class Demo_05_分割等和子集 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        int bagWeight = sum / 2;
        //初始化dp 	dp[i]含义：容量为i的最大价值
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 0;
        }
        //递推公式，给dp赋值
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagWeight; j > 0; j--) {
                if(j - nums[i] >= 0) {
                    dp[j] = Math.max(dp[j],dp[j - nums[i]] + nums[i]);
                }
            }
        }
        //遍历dp
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + "  ");
        }
        scanner.close();
        System.out.printf("%d  %.2f",10,1.235674);
    }
}
