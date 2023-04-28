package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_77_组合 {
    public static void main(String[] args) {
        combine(1,1);
    }

    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        return lists;
    }

    public static void backtrack(int n,int k,int startIndex){
        if (list.size() == k){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            list.add(i);
            backtrack(n,k,i + 1);
            list.removeLast();
        }
    }
}
