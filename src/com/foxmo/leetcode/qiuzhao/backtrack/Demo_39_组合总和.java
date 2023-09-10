package com.foxmo.leetcode.qiuzhao.backtrack;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_39_组合总和 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    int sum = 0;

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backStack(candidates,target,0);
        return result;
    }

    public void backStack(int[] candidates, int target,int startIndex){
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        } else if (sum > target){
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum += candidates[i];
            backStack(candidates,target,i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
