package com.foxmo.leetcode.qiuzhao.array;

public class Demo_27_移除元素 {
    public static void main(String[] args) {

    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0,fast = 0;
        for(;fast < nums.length;fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
