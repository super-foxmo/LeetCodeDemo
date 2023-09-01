package com.foxmo.leetcode.qiuzhao.dynamic_plan;

import java.util.Scanner;


/**
 * @author li'xiao'hui
 */
public class Demo_416_分割等和子集 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            count += nums[i];
        }
        if (count % 2 == 1){
//            return false;
            return;
        }
        int size = count / 2;
        int[][] dp = new int[m][size + 1];
        for (int i = 0; i < size + 1; i++) {
            if (i >= nums[0]){
                dp[0][i] = nums[0];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < size + 1; j++) {
                if (j - nums[i] >= 0){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - nums[i]] + nums[i]);
                } else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < size + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
