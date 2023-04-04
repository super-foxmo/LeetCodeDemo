package com.foxmo.leetcode.lanqiao;

import java.util.Scanner;

public class Demo_B_12_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int count = 3;
        int[][] ints = new int[10000][10000];
        boolean flag = false;

        init(ints);
        
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            for (int j = 0; j < Integer.MAX_VALUE; j++) {
                if (j - 1 < 0){
                    ints[i][j] = ints[i -1][j];
                }else{

                    ints[i][j] = ints[i -1][j - 1] + ints[i -1][j];
                }
                count++;
                if (ints[i][j] == n){
                    flag = true;
                    break;
                }
                if (ints[i][j] == 1 && j != 0){
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println(count);
    }
    
    public static void init(int[][] ints){
        ints[0][0] = 1;
        ints[1][0] = 1;
        ints[1][1] = 1;
    }
}
