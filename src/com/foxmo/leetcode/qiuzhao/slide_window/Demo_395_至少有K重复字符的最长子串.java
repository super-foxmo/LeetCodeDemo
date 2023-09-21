package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.HashMap;

public class Demo_395_至少有K重复字符的最长子串 {
    public int longestSubstring(String s, int k) {
        int slow = 0;
        int max = 0;
        for (; slow < s.length(); slow++) {
            for (int i = slow + 1; i <= s.length(); i++) {
                if (isPass(s.substring(slow,i),k)){
                    max = Math.max(max,i - slow);
                }
            }
        }
        return max;
    }

    public static boolean isPass(String s,int k){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = map.get(s.charAt(i));
            if (count == null){
                map.put(s.charAt(i),1);
            } else{
                map.put(s.charAt(i), count + 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) < k){
                return false;
            }
        }
        return true;
    }
}
