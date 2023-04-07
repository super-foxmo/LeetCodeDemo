package com.foxmo.leetcode.lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_13_最少刷题数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        int[] temp = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i] = scanner.nextInt();
        }
        Arrays.sort(temp);
        int mid = temp[temp.length / 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= mid){
                temp[i] = 0;
            }else{
                if (N % 2 == 0){
                    temp[i] = mid - nums[i];
                }else{
                    temp[i] = mid - nums[i] + 1;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
