package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo_17_电话号码的字母组合 {
    public static List<String> list = new ArrayList<String>();
    public static StringBuilder stringBuilder = new StringBuilder(20);
    public static HashMap<Character,String> map = new HashMap<Character,String>();

    static {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public static void main(String[] args) {

        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        char[] nums = digits.toCharArray();
        backtrack(nums,0);
        return list;
    }

    public static void backtrack(char[] nums,int startIndex){
        if (stringBuilder.length() == nums.length){
            list.add(stringBuilder.toString());
            return;
        }
        if (startIndex >= nums.length){
            return;
        }
        char[] chars = map.get(nums[startIndex]).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
            backtrack(nums,startIndex++);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
