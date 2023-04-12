package com.foxmo.leetcode.hash;

import java.util.HashMap;

public class Demo_383_赎金信 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (map.get(magazine.charAt(i)) != null){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i)) + 1);
            }else{
                map.put(magazine.charAt(i),1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (map.get(ransomNote.charAt(i)) == null || map.get(ransomNote.charAt(i)) <= 0){
                return false;
            }else{
                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i)) - 1);
            }
        }
        return true;
    }
}
