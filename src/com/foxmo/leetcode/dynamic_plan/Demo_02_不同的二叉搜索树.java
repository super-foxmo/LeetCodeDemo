package com.foxmo.leetcode.dynamic_plan;

import java.util.Scanner;

public class Demo_02_不同的二叉搜索树 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] dp = new int[num + 1];
        //初始化dp
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        //遍历赋值
        for (int i = 3; i <= num; i++) {
            int count = 0;
            int right = i - 1;
            int left = 0;
            for (int j = 1; j <= i; j++) {
                count += dp[left] * dp[right];
                left++;
                right--;
            }
            dp[i] = count;
        }
        //遍历dp
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + "  ");
        }
        scanner.close();
    }
}
