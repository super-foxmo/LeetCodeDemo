package com.foxmo.leetcode.hash;

import java.util.HashMap;

public class Demo_242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) != null){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
//        boolean flag = false;
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (map.get(c) != null && map.get(c) > 0){
                map.put(c,map.get(c) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
