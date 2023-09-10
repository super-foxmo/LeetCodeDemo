package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_216_组合总和3 {
    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    int sun = 0;

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        backStack(k,n,1);
        return result;
    }

    public void backStack(int k,int n,int startIndex){
        if (sun > n){
            return;
        }
        if (path.size() == k){
            if (sun == n){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sun += i;
            backStack(k,n,i + 1);
            sun -= i;
            path.removeLast();
        }
    }
}
