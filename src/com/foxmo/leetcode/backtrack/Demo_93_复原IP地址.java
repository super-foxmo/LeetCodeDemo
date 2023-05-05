package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_93_复原IP地址 {
    static LinkedList<String> list = new LinkedList<>();
    static List<List<String>> lists = new ArrayList<>();

    public static void main(String[] args) {
        restoreIpAddresses("25525511135");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> restoreIpAddresses(String s) {
        if (s.length() <= 12){
            StringBuilder str = new StringBuilder(s);
            backtrack(str,0,0);
        }
        return list;
    }

    public static void backtrack(StringBuilder str,int startIndex,int pointSum){
        if (pointSum == 3){
            if (isLegal(str.substring(startIndex,str.length()))){
                list.add(str.toString());
            }
            return;
        }
        for (int i = startIndex; i < str.length(); i++) {
            String subStr = str.substring(startIndex,i + 1);
            if (!isLegal(subStr)){
                break;
            }
            str.insert(i + 1,'.');
            backtrack(str,i + 2,++pointSum);    //
            pointSum--;
            str.deleteCharAt(i + 1);
        }
    }

    public static boolean isLegal(String str){
        if (str.length() > 1 && str.charAt(0) == '0' || str.length() == 0){
            return false;
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '9' || str.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (str.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
