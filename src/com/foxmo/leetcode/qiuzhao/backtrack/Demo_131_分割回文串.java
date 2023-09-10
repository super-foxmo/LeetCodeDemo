package com.foxmo.leetcode.qiuzhao.backtrack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_131_分割回文串 {
    static LinkedList<String> path = new LinkedList<>();
    static List<List<String>> result = new ArrayList<>();

    public static void main(String[] args) {
        partition("aab");
    }

    public static List<List<String>> partition(String s) {
        backStack(s,0);
        return result;
    }

    public static void backStack(String s,int startIndex){
        if (startIndex == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
//            // 去重
//            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]){
//                continue;
//            }

            String substr = s.substring(startIndex, i + 1);
            if (!isHuiWen(substr)){
                continue;
            }
            path.add(substr);
            backStack(s,i + 1);
            path.removeLast();
        }
    }

    public static boolean isHuiWen(String s){
        if (s.length() == 1){
            return true;
        }
        int right = 0, left = s.length() - 1;
        while(right <= left){
            if (s.charAt(right) != s.charAt(left)){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
