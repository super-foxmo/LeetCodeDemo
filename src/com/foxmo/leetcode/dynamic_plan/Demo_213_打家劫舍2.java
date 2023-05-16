package com.foxmo.leetcode.dynamic_plan;


public class Demo_213_打家劫舍2 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1,3,6,7,10,7,1,8,5,9,1,4,4,3}));

    }

    public static int robAction(int[] nums, int start, int end) {
        //初始化dp
        int[] dp = new int[end - start];
        int[] tNums = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            tNums[index] = nums[i];
            index++;
        }
        dp[0] = tNums[0];
        dp[1] = Math.max(dp[0],tNums[1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + tNums[i],dp[i - 1]);
        }

        return dp[end - start - 1];
    }

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length < 4){
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < length; i++) {
                if (nums[i] > max){
                    max = nums[i];
                }
            }
            return max;
        }
        return Math.max(robAction(nums,0,length - 1),robAction(nums,1,length));
    }

//    public static int rob(int[] nums) {
//        int length = nums.length;
//        if (length < 4){
//            int max = Integer.MIN_VALUE;
//            for (int i = 0; i < length; i++) {
//                if (nums[i] > max){
//                    max = nums[i];
//                }
//            }
//            return max;
//        }
//        boolean[] used = new boolean[length];
//        //初始化dp
//        int[] dp = new int[length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(dp[0],nums[1]);
//
//        used[0] = true;
//        if (nums[0] > nums[1]){
//            used[1] = true;
//        }
//
//        for (int i = 2; i < dp.length - 1; i++) {
//            if (dp[i - 2] + nums[i] > dp[i - 1]){
//                used[i] = used[i - 2];
//            }else if(dp[i - 2] + nums[i] < dp[i - 1]){
//                used[i] = used[i - 1];
//            }else{
//                used[i] = used[i - 1] && used[i - 2];
//            }
//            dp[i] = Math.max(dp[i - 2] + nums[i],dp[i - 1]);
//        }
//
//        if (used[length - 3]){
//            dp[length - 1] = Math.max(dp[length - 2],dp[length - 3]);
//        }else{
//            dp[length - 1] = Math.max(dp[length - 2],dp[length - 3] + nums[length - 1]);
//        }
//
//        return dp[length - 1];
//    }
}
