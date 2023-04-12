package com.foxmo.leetcode.hash;

import java.util.HashMap;

public class Demo_454_四数相加 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (map.get(nums1[i] + nums2[j]) != null){
                    map.put(nums1[i] + nums2[j],map.get(nums1[i] + nums2[j]) + 1);
                }else{
                    map.put(nums1[i] + nums2[j],1);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                int target = 0 - nums3[i] - nums4[j];
                if(map.get(target) != null){
                    count += map.get(target);
                }
            }
        }
        return count;
    }
}
