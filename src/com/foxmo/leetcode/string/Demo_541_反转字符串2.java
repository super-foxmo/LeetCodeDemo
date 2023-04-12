package com.foxmo.leetcode.string;

public class Demo_541_反转字符串2 {
    public String reverseStr(String s, int k) {
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (i + k <= s.length()){
                s = reverse(s,i,i+k);
                continue;
            }
            s = reverse(s,i,s.length());
        }
        return s;
    }

    public String reverse(String s,int left,int right){
        char[] chars = s.toCharArray();
        while(left < right - 1){
            char temp = chars[right];
            chars[left] = chars[right];
            chars[left] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

}
