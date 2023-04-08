package com.foxmo.leetcode.dynamic_plan;

public class Demo_07_最短路径 {
    public static void main(String[] args) {
        int[] f = new int[2050];
        for (int i = 1; i <= 2021; i++) {
            for (int j = i + 1; j <= i + 21; j++) {
                if (f[j] == 0) {
                    f[j] = f[i] + lcm(i, j);
                } else {
                    f[j] = Math.min(f[j], f[i] + lcm(i, j));
                }
            }
        }

        System.out.println(f[2021]);
    }

    private static int lcm(int a, int b) {
        int t = 1;
        while (b * t % a != 0) {
            t++;
        }
        return t * b;
    }

}
