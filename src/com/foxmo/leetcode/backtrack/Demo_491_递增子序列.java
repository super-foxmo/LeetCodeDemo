package com.foxmo.leetcode.backtrack;

import java.util.*;

public class Demo_491_递增子序列 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        findSubsequences(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1, 1, 1, 1});
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
//        Arrays.sort(nums);
        backtrack(nums, 0);
        return lists;
    }

    public static void backtrack(int[] nums, int startIndex) {
        if (list.size() >= 2) {
            lists.add(new ArrayList<>(list));
        }
        HashSet<Integer> set = new HashSet<>();

        for (int i = startIndex; i < nums.length; i++) {
            if (set.contains(nums[i]) || !list.isEmpty() && nums[i] < list.getLast().intValue()) {
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);

            backtrack(nums, i + 1);
            list.removeLast();
        }
    }

//    public static boolean contain(HashSet<Integer> set,Integer i){
//        if (set.isEmpty()){
//            return false;
//        }
//        for (Integer integer : set) {
//            if (integer.compareTo(i) != 0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean isASC(List<Integer> list) {
//        Integer pre = Integer.MIN_VALUE;
//        for (Integer i : list) {
//            if (pre <= i) {
//                pre = i;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
}
