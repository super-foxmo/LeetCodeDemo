package com.foxmo.leetcode.greedy_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_02_买卖股票的最佳时机 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        ArrayList<Integer> in = new ArrayList<Integer>();
        ArrayList<Integer> out = new ArrayList<Integer>();

        //true: 当前有股票未卖出 	false：当前未买进股票
        boolean flag = false;
        int preIndex = 1;
        for (int i = preIndex + 1; i < nums.length; i++) {
            if (nums[i] - nums[preIndex] > 0 && !flag) {
                in.add(preIndex);
                flag = true;
            }else if(nums[i] - nums[preIndex] <= 0 && flag) {
                out.add(preIndex);
                flag = false;
            }
            preIndex = i;
        }

        System.out.println("最佳买进时间为：" + in);
        System.out.println("最佳买进时间为: " + out);
    }
}
