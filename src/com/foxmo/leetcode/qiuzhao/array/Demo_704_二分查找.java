package com.foxmo.leetcode.qiuzhao.array;

public class Demo_704_二分查找 {
    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int midder = (left + right) / 2;
        while(left <= right){
            if(nums[midder] == target){
                return midder;
            } else if(nums[midder] > target){
                right = midder - 1;
            } else{
                left = midder + 1;
            }
            midder = (left + right) / 2;
        }
        return - 1;
    }
}
