package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_131_分割回文串 {
    static LinkedList<String> list = new LinkedList<>();
    static List<List<String>> lists = new ArrayList<>();

    public static void main(String[] args) {
        partition("aab");
    }

    public static List<List<String>> partition(String s) {
        backtrack(s,0);
        return lists;
    }

    public static void backtrack(String str,int startIndex){
        if (startIndex >= str.length()){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i < str.length(); i++) {
            String subStr = str.substring(startIndex,i + 1);
            if (isHuiWen(subStr)){
                list.add(subStr);
            }else{
                continue;
            }
            backtrack(str,i + 1);
            list.removeLast();
        }
    }

    /**
     * 回文判断
     * @param str
     * @return
     */
    public static boolean isHuiWen(String str){
        int right = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++,right--) {
            if (str.charAt(i) != str.charAt(right)){
                return false;
            }
        }
        return true;
    }
}
