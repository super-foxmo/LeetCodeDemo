package com.foxmo.leetcode.qiuzhao.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo_77_组合 {
     LinkedList<Integer> path = new LinkedList<Integer>();
     List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1);
        return result;
    }

    public void backtrack(int n,int k,int startIndex){
        if (path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtrack(n,k,i + 1);
            path.removeLast();
        }
    }
}
