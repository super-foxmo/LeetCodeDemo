package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_47_全排列2 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        Demo_47_全排列2 demo = new Demo_47_全排列2();
        demo.permute(new int[]{1,1,2});
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public  List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new boolean[nums.length]);
        return lists;
    }

    public  void backtrack(int[] nums,boolean[] used){
        if (list.size() == nums.length){
            lists.add(new ArrayList<>(list));
        }
        for (int i = 0; i < used.length; i++) {
            if (used[i] == true){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false){
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
