package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.ArrayList;
import java.util.List;

public class Demo_438_找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        List<Integer> list = findAnagrams("cbaebabacd", "abc");
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        int plen = p.length();
        if (s.length() < plen){
            return result;
        }
        int slow = 0;
        for (int i = slow + plen; i <= s.length(); i++,slow++) {
            String sub = s.substring(slow, i);
            if (isAllotopicWord(sub,p)){
                result.add(slow);
            }
        }
        return result;
    }

    public static boolean isAllotopicWord(String sub,String p){
        if (sub.length() != p.length()){
            return false;
        }
        for (int i = 0; i < sub.length(); i++) {
            if (!p.contains(sub.charAt(i) + "")) {
                return false;
            }
            p = p.replaceFirst(sub.charAt(i) + "","");
        }
        return true;
    }
}
