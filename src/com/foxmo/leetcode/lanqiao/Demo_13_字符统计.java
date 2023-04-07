package com.foxmo.leetcode.lanqiao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Demo_13_字符统计 {
    public static void main(String[] args) {
//        String str = new String("BABBACAC");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        char pre = ' ';
        int max = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(pre != chars[i]){
                count = 1;
            }else{
                count++;
            }
            pre = chars[i];
            max = Math.max(count,max);
        }
        pre = ' ';
        count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(pre != chars[i]){
                count = 1;
            }else{
                count++;
            }
            if (count == max){
                System.out.print(chars[i]);
            }
            pre = chars[i];
        }
    }
}
