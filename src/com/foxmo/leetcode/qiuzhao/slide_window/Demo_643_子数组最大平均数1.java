package com.foxmo.leetcode.qiuzhao.slide_window;

import java.math.BigDecimal;

public class Demo_643_子数组最大平均数1 {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length < k){
            return 0;
        }
        double max = Integer.MIN_VALUE;
        double temp = 0;
        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }
        max = Math.max(max,temp);
        for (int slow = 0; slow < nums.length - k; slow++) {
            temp -= nums[slow];
            temp += nums[slow + k];
            max = Math.max(max,temp);
        }
        return max / k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{0,4,0,3,2}, 1));
    }
}
