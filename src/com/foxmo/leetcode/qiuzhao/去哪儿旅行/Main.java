package com.foxmo.leetcode.qiuzhao.去哪儿旅行;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer count = map.get(c);
            if (count != null){
                map.put(c,++count);
            } else{
                map.put(c,1);
            }
        }
        Set<Character> keys = map.keySet();
        Character c1 = null;
        int temp = 0;
        for (Character key : keys) {
            Integer count1 = map.get(key);
            if (temp < count1){
                temp = count1;
                c1 = key;
            }
        }
        System.out.println(c1+ ":" +map.get(c1));
    }
}
