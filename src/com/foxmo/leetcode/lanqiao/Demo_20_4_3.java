package com.foxmo.leetcode.lanqiao;

public class Demo_20_4_3 {
    public static void main(String[] args) {
        System.out.println(demo(2019));
    }

    public static int demo(int sum){
        int i = 1;
        while(sum >= i){
            sum -= i;
            i = 2 * i;
        }
        if (sum % 2 == 0){
            return i / 2 - sum / 2;
        }
        return i / 2 - sum / 2 -1;
    }
}
