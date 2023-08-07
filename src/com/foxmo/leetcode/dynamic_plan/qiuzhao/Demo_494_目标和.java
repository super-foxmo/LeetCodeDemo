package com.foxmo.leetcode.dynamic_plan.qiuzhao;

import java.util.Scanner;

public class Demo_494_目标和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            count += nums[i];
        }
        // 注意nums[i] >= 0的题目条件，意味着sum也是所有nums[i]的绝对值之和
        // 这里保证了sum + target一定是大于等于零的，也就是left大于等于零（毕竟我们定义left大于right）
        if(count < Math.abs(target)){
            return;
        }
        if ((Math.abs(target) + count) % 2 == 1){
            System.out.println(0);
            return;
        }
        int size = (Math.abs(target) + count) / 2;
        int[][] dp = new int[m][size + 1];
//        for (int i = 0; i < m; i++) {
//            dp[0][0] = 1;
        dp[0][nums[0]] = 1;
        // 初始化最左列（dp[i][0])
        // 当从nums数组的索引0到i的部分有n个0时（n > 0)，每个0可以取+/-，因此有2的n次方中可以取到j = 0的方案
        // n = 0说明当前遍历到的数组部分没有0全为正数，因此只有一种方案可以取到j = 0（就是所有数都不取）
        int numZeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                numZeros++;
            }
            dp[i][0] = (int) Math.pow(2, numZeros);

        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < size + 1; j++) {
                if (j - nums[i] >= 0){
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i]];
                } else{
                    dp[i][j] = dp[i- 1][j];
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
