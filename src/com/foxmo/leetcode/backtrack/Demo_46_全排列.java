package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_46_全排列 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        permute(new int[]{0,1});
    }
    public static List<List<Integer>> permute(int[] nums) {
        backtrack(nums,new boolean[nums.length]);
        return lists;
    }

    public static void backtrack(int[] nums,boolean[] used){
        if (list.size() == nums.length){
            lists.add(new ArrayList<>(list));
        }
        for (int i = 0; i < used.length; i++) {
            if (used[i] == true){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backtrack(nums,used);
            used[i] = false;
            list.removeLast();
        }
    }
}
