package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_39_组合总和 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,5},8);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        return lists;
    }

    public static void backtrack(int[] candidates,int target,int startIndex){
//        int count = getCount(list);
        if (count == target) {      //决定深度
            lists.add(new ArrayList<>(list));
            return;
        }else if (count > target){
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {      //决定宽度
            count += candidates[i];
            if (count > target){
                count -= candidates[i];
                break;
            }
            list.add(candidates[i]);
            backtrack(candidates,target,i);
            count -= candidates[i];
            list.removeLast();
        }
    }

    public static int getCount(List<Integer> list){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        return count;
    }
}
