package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_491_递增子序列 {
    static LinkedList<Integer> path = new LinkedList<>();
    static List<List<Integer>> result = new ArrayList<>();
    static boolean[] used;

    public static void main(String[] args) {
        findSubsequences(new int[]{4,4,3,2,1});
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        used = new boolean[nums.length];
        backTrack(nums,0,used);
        return result;
    }

    public static void backTrack(int[] nums,int startIndex,boolean[] used){
        if (startIndex == nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            // 去重
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }
            if (path.size() > 0 && path.getLast() > nums[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            if (path.size() >= 2){
                result.add(new ArrayList<>(path));
            }
            backTrack(nums,i + 1,used);
            used[i] = false;
            path.removeLast();
        }
    }
}
