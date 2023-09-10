package com.foxmo.leetcode.qiuzhao.backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Demo_40_组合总和2 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    int sum = 0;
    boolean[] used;

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        int[] sortedCandidates = Arrays.stream(candidates).sorted().toArray();
        backStack(sortedCandidates,target,0,used);
        return result;
    }

    public void backStack(int[] candidates, int target,int startIndex,boolean[] used){
        if (sum == target){
            result.add(new ArrayList<>(path));
            return;
        } else if (sum > target){
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            // 去重
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]){
                continue;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            used[i] = true;
            backStack(candidates,target,i + 1,used);
            used[i] = false;
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
