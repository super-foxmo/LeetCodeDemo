package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.HashMap;

public class Demo_424_替换后的最长重复字符 {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int slow = 0;
        for (;slow < s.length(); slow++) {
            for (int i = slow + 1 + k; i <= s.length(); i++) {
                if (isPass(s.substring(slow,i),k)){
                    max = Math.max(max,i - slow);
                }
            }
        }
        return max;
    }

    public static boolean isPass(String s,int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer count = map.get(s.charAt(i));
            if (count == null){
                map.put(s.charAt(i),1);
            } else{
                map.put(s.charAt(i), count + 1);
            }
            max = Math.max(max,map.get(s.charAt(i)));
        }
        if (s.length() - max <= k){
            return true;
        }
        return false;
    }
}
