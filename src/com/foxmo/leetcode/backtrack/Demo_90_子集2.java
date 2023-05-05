package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_90_子集2 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        subsetsWithDup(new int[]{4,4,4,1,4});
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        lists.add(new ArrayList<>());
        Arrays.sort(nums);
        backtrack(nums,0,);
        return lists;
    }

    public static void backtrack(int[] nums,int startIndex,boolean[] used){
        for (int i = startIndex; i < nums.length; i++) {
            //去重
            if (i > 0 && nums[i] == nums[i - 1] && used[i-1] == false){
                continue;
            }
            used[i] = true;
            list.add(nums[i]);
            lists.add(new ArrayList<>(list));
            backtrack(nums,i + 1,used);
            used[i] = false;
            list.removeLast();
        }
    }

}
