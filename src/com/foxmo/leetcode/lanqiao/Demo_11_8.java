package com.foxmo.leetcode.lanqiao;

import java.util.HashSet;
import java.util.Scanner;

public class Demo_11_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                int num = distinctCharNum(subStr);
                count += num;
            }
        }
        System.out.println(count);
    }

    public static int distinctCharNum(String str){
        char[] chars = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        return 2 * set.size() - chars.length;
    }
}
