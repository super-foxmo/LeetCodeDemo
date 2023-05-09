package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_零钱兑换 {
    public static LinkedList<Integer> list = new LinkedList<>();
    public static ArrayList<List<Integer>> lists = new ArrayList<>();
    public static int count = 0;

    public static void main(String[] args) {
        backtrack(5,new int[]{1,2,5});
        for (List<Integer> l : lists) {
            for (Integer integer : l) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void backtrack(int amount,int[] coins){
        if (!list.isEmpty() && getAmount(list) == amount){
            lists.add(new ArrayList<>(list));
            count++;
            return;
        }
        if (!list.isEmpty() && getAmount(list) > amount){
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            list.add(coins[i]);
            backtrack(amount,coins);
            list.removeLast();
        }
    }

    public static int getAmount(List<Integer> list){
        int sum = 0;
        for (Integer i : list) {
            sum += i.intValue();
        }
        return sum;
    }
}
