package com.foxmo.leetcode.qiuzhao.slide_window;

public class Demo_220_存在重复元素3 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != slow) {
                while (Math.abs(i - slow) > indexDiff) {
                    slow++;
                }
                if (Math.abs(nums[i] - nums[slow]) <= valueDiff) {
                    return true;
                } else if (Math.abs(i - slow) <= indexDiff) {
                }
            }
        }
        return false;
    }
}
