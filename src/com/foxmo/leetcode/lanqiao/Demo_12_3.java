package com.foxmo.leetcode.lanqiao;

public class Demo_12_3 {
    public static void main(String[] args) {
        long n = 2020l;
        long count = 0;
        for (long l = 1; l <= n; l++){
            for (long w = 1; w <= n; w++){
                for (long h = 1; h <= n; h++){
                    if (l * w * h == n){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
