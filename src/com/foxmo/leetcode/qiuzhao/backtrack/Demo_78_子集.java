package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_78_子集 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList());
        backTrack(nums,0);
        return result;
    }

    public void backTrack(int[] nums,int startIndex){
        if (startIndex == nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            result.add(new ArrayList<>(path));
            backTrack(nums,i + 1);
            path.removeLast();
        }
    }
}
