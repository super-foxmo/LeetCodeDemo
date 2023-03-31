package com.foxmo.leetcode.lanqiao;

import java.util.Scanner;

public class Demo_11_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < count; i++) {
            int score = scanner.nextInt();
            min = Math.min(min,score);
            max = Math.max(max,score);
            sum += score;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.printf("%.2f",sum / count);

    }
}
