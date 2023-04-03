package com.foxmo.leetcode.lanqiao;

/*你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意
小于等于 N 的正整数重量。
那么这套砝码最少需要包含多少个砝码？
注意砝码可以放在天平两边。*/

import java.util.Scanner;

public class Demo_12_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dfs(n));
        scanner.close();
    }

    public static int dfs(int cur) {
        int weight = 1;
        int count = 1;
        int total = 1;
        while (total < cur) {
            count++;
            weight *= 3;
            total += weight;
        }
        return count;
    }

}
