package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_567_字符串的排列 {
    static StringBuilder path = new StringBuilder();
    static List<String> result = new ArrayList<>();
    static boolean[] used;

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        } else if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                if (s2.contains(s1.charAt(i) + "")){
                    s2.replaceFirst(s1.charAt(i) + "","");
                } else{
                    return false;
                }
            }
            return true;
        }
        used = new boolean[s1.length()];
        backTrack(s1);
        for (String s : result) {
            if (s2.contains(s)){
                return true;
            }
        }
        return false;
    }

    public static void backTrack(String s1){
        if (path.length() == s1.length()){
            result.add(path.toString());
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (used[i]){
                continue;
            }
            path.append(s1.charAt(i));
            used[i] = true;
            backTrack(s1);
            used[i] = false;
            int index = path.lastIndexOf(s1.charAt(i) + "");
            path.replace(index,index + 1,"");
        }
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("hello", "ooolleoooleh"));
    }
}
