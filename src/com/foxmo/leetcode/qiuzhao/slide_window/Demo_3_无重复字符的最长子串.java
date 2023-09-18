package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Demo_3_无重复字符的最长子串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s) {
        int slow = 0;
        int max = 0;
        if (s.length() == 1){
            return 1;
        } else if (s.length() == 0){
            return 0;
        }
        for (int fast = 0; fast < s.length(); fast++) {
            while(!isRepetition(s.substring(slow,fast + 1))){
                slow++;
            }

            max = Math.max(max,fast - slow + 1);
        }
        return max;
    }

    public static boolean isRepetition(String sub){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sub.length(); i++) {
            if (set.contains(sub.charAt(i))){
                return false;
            } else{
                set.add(sub.charAt(i));
            }
        }
        return true;
    }
}
