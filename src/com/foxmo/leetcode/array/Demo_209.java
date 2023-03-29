package com.foxmo.leetcode.array;

/*给定一个含有 n 个正整数的数组和一个正整数 target 。

找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
*/

public class Demo_209 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int count = 0;
        int len = Integer.MAX_VALUE;
        while (end < nums.length) {
            count += nums[end];
            while (count >= target) {
                len = Math.min(len, end - start + 1);
                count -= nums[start];
                start++;
            }
            end++;
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
