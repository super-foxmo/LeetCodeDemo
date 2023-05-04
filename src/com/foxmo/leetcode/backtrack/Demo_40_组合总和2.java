package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_40_组合总和2 {
    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) {
        combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
        }

        for (int i = startIndex; i < candidates.length; i++) {      //决定宽度
            count += candidates[i];
            if (count > target){
                count -= candidates[i];
                break;
            }
            if (lists.size() > 0){
                boolean flag = true;
                for (int j = 0; j < list.size(); j++) {
                    if (lists.get(lists.size() - 1).size() <= j || lists.get(lists.size() - 1).get(j) != list.get(j)){
                        flag = false;
                    }
                }
                if (flag && lists.get(lists.size() - 1).get(list.size()) == candidates[i]){
                    count -= candidates[i];
                    continue;
                }
            }

            list.add(candidates[i]);
            backtrack(candidates,target,i + 1);
            count -= candidates[i];
            list.removeLast();
        }
    }
}
