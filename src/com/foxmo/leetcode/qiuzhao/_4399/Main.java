package com.foxmo.leetcode.qiuzhao._4399;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        while(scanner.hasNextInt()){
//            list.add(scanner.nextInt());
//        }
//        int count = (list.size() - 1) / 2;
//        int sum =  list.get(list.size() - 1);
//        int num = 0;
//        for(int i = 0;i < count;i++){
//            num += list.get(i) * list.get(i + count);
//        }
//        if (num < sum){
//            System.out.println(-1);
//        }
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            count[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE - 10;
        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= count[i]; j++) {
                for (int k = sum; k >= coins[i] * j;k--){
                    dp[k] = Math.min(dp[k], dp[k - (coins[i] * j)] + 1);
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
