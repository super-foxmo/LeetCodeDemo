package com.foxmo.leetcode.array;

/*给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。*/

import java.util.Arrays;

public class Demo_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        //寻找正数与负数之间的分界线
        int negative = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 0){
                negative  = i;
            }else {
                break;
            }
        }
        int[] ans = new int[nums.length];
        int index = 0,i = negative,j = negative + 1;
        while(i >= 0 || j < nums.length){
            if(i < 0){
                ans[index] = nums[j] * nums[j];
                j++;
            }else if(j == nums.length){
                ans[index] = nums[i] * nums[i];
                i--;
            }else if(nums[i] * nums[i] < nums[j] * nums[j]){
                ans[index] = nums[i] * nums[i];
                i--;
            }else{
                ans[index] = nums[j] * nums[j];
                j++;
            }
            index++;
        }
        return ans;
    }
}
