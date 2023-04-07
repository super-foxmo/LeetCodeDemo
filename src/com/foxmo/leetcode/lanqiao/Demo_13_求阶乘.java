package com.foxmo.leetcode.lanqiao;

public class Demo_13_求阶乘 {
    public static void main(String[] args) {
        long sum = 1l;
        for (int i = 1; i <= 100; i++) {
            sum = sum * i;
            System.out.println(sum);
        }
    }
}
