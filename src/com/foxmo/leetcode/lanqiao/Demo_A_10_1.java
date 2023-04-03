package com.foxmo.leetcode.lanqiao;

public class Demo_A_10_1 {
    public static void main(String[] args) {
        Long count = 0L;
        for (Integer i = 1; i <= 2019; i++) {
            String str = i.toString();
            if(str.contains("2") || str.contains("0") || str.contains("1") || str.contains("9")){
                Integer integer = new Integer(str);
                count += integer * integer;
            }
        }
        System.out.println(count);
    }
}
