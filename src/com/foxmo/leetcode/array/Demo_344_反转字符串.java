package com.foxmo.leetcode.array;

public class Demo_344_反转字符串 {
    public void reverseString(char[] s) {
        int left = 0,right = s.length - 1;
        char temp;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
