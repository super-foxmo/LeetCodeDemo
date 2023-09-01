package com.foxmo.leetcode.qiuzhao.dynamic_plan;

public class Demo_213_打家劫舍2 {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1,3,6,7,10,7,1,8,5,9,1,4,4,3}));
    }

    public static int rob(int[] nums) {
        if(nums.length == 1){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }

        int[] dp = new int[nums.length + 1];
        boolean[] fleg = new boolean[nums.length + 1];
        fleg[0] = false;
        fleg[1] = true;
        dp[0] = 0;
        dp[1] = nums[0];
//        dp[2] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < dp.length;i++){
            if(i == dp.length - 1 && fleg[i - 2]){
                for (int j = i - 1; j >= 0 ; j--) {
                    if (!fleg[j]){
                        dp[i] = Math.max(dp[i - 1],dp[j] + nums[i - 1]);
                    }
                }

            }else{
                if(dp[i - 1] > dp[i - 2] + nums[i - 1]){
                    dp[i] = dp[i - 1];
                    fleg[i] = fleg[i -1];
                }else if(dp[i - 1] < dp[i - 2] + nums[i - 1]) {
                    dp[i] = dp[i - 2] + nums[i - 1];
                    fleg[i] = fleg[i -2];
                }else{
                    dp[i] = dp[i - 1];
                    fleg[i] = fleg[i - 1] && fleg[i - 2];
                }
            }
        }
        return dp[nums.length];
    }
}
