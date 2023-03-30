package com.foxmo.leetcode.lanqiao;

/*1200000有多少个约数（只计算正约数）。*/

public class Demo_20_4_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1200000; i++) {
            if (1200000 % i == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
