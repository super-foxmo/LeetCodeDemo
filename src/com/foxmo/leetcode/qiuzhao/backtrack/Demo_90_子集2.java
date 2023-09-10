package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_90_子集2 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used;

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        used = new boolean[nums.length];
        result.add(new ArrayList());
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        backTrack(sortedNums,0,used);
        return result;
    }

    public void backTrack(int[] nums,int startIndex,boolean[] used){
        if (startIndex == nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            // 去重
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            result.add(new ArrayList<>(path));
            backTrack(nums,i + 1,used);
            used[i] = false;
            path.removeLast();
        }
    }
}
