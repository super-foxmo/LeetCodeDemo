package com.foxmo.leetcode.backtrack;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_78_子集 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0);

        return lists;
    }

    public static void backtrack(int[] nums,int startIndex){
        if (startIndex >= nums.length){
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            lists.add(new ArrayList<>(list));
            backtrack(nums,i + 1);
            list.removeLast();
        }
    }
}
