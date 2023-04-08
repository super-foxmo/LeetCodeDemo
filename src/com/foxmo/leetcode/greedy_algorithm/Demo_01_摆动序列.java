package com.foxmo.leetcode.greedy_algorithm;

public class Demo_01_摆动序列 {
    public static void main(String[] args) {
        int count = solution(new int[]{1,17,5,10,13,15,10,5,16,8});
        System.out.println(count);
    }

    public static int solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        boolean flag = false;
        boolean preFlag = false;
        int count = 2;
        if (nums.length == 2) {
            return count;
        }
        int preIndex = 0;
        for (int i = preIndex + 1; i < nums.length; i++) {
            preFlag = flag;
            if (nums[i] - nums[preIndex] > 0) {
                flag = true;
            }else {
                flag = false;
            }
            // && preIndex != 0
            if (preFlag != flag && preIndex != 0) {
                count++;
            }
            preIndex = i;
        }
        return count;
    }
}
