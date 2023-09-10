package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_47_全排列2 {
    static LinkedList<Integer> path = new LinkedList<>();
    static List<List<Integer>> result = new ArrayList<>();
    static boolean[] used;

    public static void main(String[] args) {
        permuteUnique(new int[]{1,1,2});

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        backTrack(sortedNums,used);
        return result;
    }

    public static void backTrack(int[] nums,boolean[] used){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }
            if (used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backTrack(nums,used);
            used[i] = false;
            path.removeLast();
        }
    }
}
