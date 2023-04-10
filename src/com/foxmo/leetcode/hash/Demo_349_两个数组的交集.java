package com.foxmo.leetcode.hash;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo_349_两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ints = intersection(nums1, nums2);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        nums1 = Arrays.stream(nums1).distinct().toArray();
        nums2 = Arrays.stream(nums2).distinct().toArray();
        int len = Math.min(nums1.length,nums2.length);
        int[] ans = new int[len];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    ans[index] = nums1[i];
                    index++;
                }
            }
        }
        return Arrays.stream(ans).limit(index).toArray();
    }
}
