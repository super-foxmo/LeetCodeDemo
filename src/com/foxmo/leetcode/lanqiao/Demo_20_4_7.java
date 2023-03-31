package com.foxmo.leetcode.lanqiao;

/*小明对类似于 hello 这种单词非常感兴趣，这种单词可以正好分为四段，第一段由一个或多个辅音字母组成，第二段由一个或多个元音字母组成，第三段由一个或多个辅音字母组成，第四段由一个或多个元音字母组成。
给定一个单词，请判断这个单词是否也是这种单词，如果是请输出yes，否则请输出no。
元音字母包括 a, e, i, o, u，共五个，其他均为辅音字母。
【输入格式】
输入一行，包含一个单词，单词中只包含小写英文字母。
【输出格式】
输出答案，或者为yes，或者为no。
【样例输入】
lanqiao
【样例输出】
yes
*/

public class Demo_20_4_7 {
    public static void main(String[] args) {
        System.out.println(solution("lanqiao"));
        System.out.println(solution("hello"));
        System.out.println(solution("world"));
    }
    public static String solution(String word){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (count % 2 == 0 && !judgeVowel(word.charAt(i))){
                count++;
            }
            if (count % 2 == 1 && judgeVowel(word.charAt(i))){
                count++;
            }
        }
        if (count == 4){
            return "yes";
        }
        return "no";
    }

    public static boolean judgeVowel(char vow){
        if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u')
            return true;
        return false;
    }
}
