package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.HashMap;

public class Demo_219_存在重复元素2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if (Math.abs(i - map.get(nums[i])) <= k){
                    return true;
                }
                map.put(nums[i],i);
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
