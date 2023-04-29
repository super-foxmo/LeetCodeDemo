package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_216_组合总和 {
    public static void main(String[] args) {
        combinationSum3(3,7);
    }

    static LinkedList<Integer> list = new LinkedList<>();
    static List<List<Integer>> lists = new ArrayList<>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(n,k,1);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        return lists;
    }

    public static void backtrack(int n,int k,int startIndex){
        if (list.size() == k){
            if (getCount(list) == n){

                lists.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - list.size()) + 1; i++) {
            list.add(i);
            backtrack(n,k,i + 1);
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
