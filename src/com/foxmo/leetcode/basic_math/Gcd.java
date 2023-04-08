package com.foxmo.leetcode.basic_math;

public class Gcd {
    /**
     * 最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int gcd(int m,int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }
}
