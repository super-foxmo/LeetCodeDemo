package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_46_全排列 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used;

    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backTrack(nums,used);
        return result;
    }

    public void backTrack(int[] nums,boolean[] used){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
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
