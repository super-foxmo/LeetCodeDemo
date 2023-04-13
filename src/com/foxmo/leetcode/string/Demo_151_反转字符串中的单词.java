package com.foxmo.leetcode.string;

public class Demo_151_反转字符串中的单词 {
    public static void main(String[] args) {
        System.out.println("  fasd   ds f  dfsgs  d ");
        System.out.println(reverseWords("  fasd   ds f  dfsgs  d "));
    }
    public static String reverseWords(String s) {
        String str = removeSpace(s);
        String reStr = reverse(str, 0, str.length());
        int left = 0;
        for (int i = 1; i < reStr.length(); i++) {
            if (reStr.charAt(i) == ' '){
                reStr = reverse(reStr,left,i);

                left = i + 1;
                i++;
            }
        }
        return reStr;
    }

    public static String removeSpace(String s){
        char[] chars = s.toCharArray();
        int index  = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' '){
                if (index != 0)
                    chars[index++] = ' ';
                while(chars[i] != ' '){
                    chars[index] = chars[i];
                    index++;
                    i++;
                }
            }
        }
        String str = new String();
        for (int i = 0; i < index; i++) {
            str += chars[i];
        }

        return str;
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
