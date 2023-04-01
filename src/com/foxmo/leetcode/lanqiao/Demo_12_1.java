package com.foxmo.leetcode.lanqiao;

public class Demo_12_1 {
    public static void main(String[] args) {
        for (long i = 1; i <= 1000000007;i++){
            if(i * 2021 % 1000000007 == 999999999){
                System.out.println(i);
            }
        }
        System.out.println(0);
    }
}
