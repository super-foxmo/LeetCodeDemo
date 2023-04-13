package com.foxmo.leetcode.string;

public class Demo_541_反转字符串2 {
    public static void main(String[] args) {
        String str = reverseStr("abcdefg", 2);
        System.out.println("abcdefg");
        System.out.println(str);
    }
    public static String reverseStr(String s, int k) {
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (i + k <= s.length()){
                s = reverse(s,i,i+k);
                continue;
            }
            s = reverse(s,i,s.length());
        }
        return s;
    }

    public static String reverse(String s,int left,int right){
        char[] chars = s.toCharArray();
        while(left < right){
            char temp = chars[right - 1];
            chars[right - 1] = chars[left];
            chars[left] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
