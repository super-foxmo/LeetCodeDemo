package com.foxmo.leetcode.lanqiao;

public class Demo_13_星期计算 {
    public static void main(String[] args) {
        double sum = Math.pow(20, 22);
        double count = sum % 7;
        System.out.println(sum);
//        System.out.println(count);
        double res = 20.0;
        for (int i = 0; i < 21; i++) {
            res = res * 20;
        }
        System.out.println(res);
        System.out.println(res % 7);
    }
}
