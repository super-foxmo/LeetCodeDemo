package com.foxmo.leetcode.lanqiao;

public class Demo_11_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 20 + 19; i++) {
            count += i;
        }
        count +=  20;
        System.out.println(count);
    }
}
