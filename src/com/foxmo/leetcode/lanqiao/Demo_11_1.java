package com.foxmo.leetcode.lanqiao;

/*在计算机存储中，15.125GB是多少MB？*/

public class Demo_11_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2020; i++) {
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
