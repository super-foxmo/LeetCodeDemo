package com.foxmo.leetcode.qiuzhao.微众银行;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        if (len == 0){
            System.out.println(0);
        }
        if (len == 1){
            System.out.println(1);
        }
        int maxLen = 0;
        int slow = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                maxLen = Math.max(maxLen,i - slow);
                slow = i;
            } else if (i == nums.length - 1 && nums[i] != nums[i - 1]){
                maxLen = Math.max(maxLen,i - slow + 1);
            }
        }
        System.out.println(maxLen);
    }
}
