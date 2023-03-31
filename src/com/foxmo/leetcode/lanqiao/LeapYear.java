package com.foxmo.leetcode.lanqiao;

/*闰年判断*/

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(judgeLeap(2000));
    }

    public static boolean judgeLeap(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }
}
