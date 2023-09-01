package com.foxmo.leetcode.qiuzhao.array;

public class Demo_209_长度最小的子数组 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length <= 0 ){
            return 0;
        } if (nums.length == 1){
            if (nums[0] == target){
                return 1;
            }
            return 0;
        }
        int slow = 0,fast = 0;
        int minLen = Integer.MAX_VALUE,count = nums[0];
        while(slow <= fast){
            if(count == target){
                minLen = Math.min(minLen,(fast - slow) + 1);
                count -= nums[slow];
                slow++;
            } else if(count > target){
                count -= nums[slow];
                slow++;
                if (count >= target){
                    continue;
                }
            }

            if (fast < nums.length - 1){
                fast++;
                count += nums[fast];
            }else if (fast == nums.length - 1 && count < target){
                break;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
