package com.foxmo.leetcode.basic_math;

public class Lcm {
    public static int lcm(int m,int n) {
        return m * n / Gcd.gcd(m, n);
    }
}
