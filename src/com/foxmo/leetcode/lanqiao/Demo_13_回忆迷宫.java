package com.foxmo.leetcode.lanqiao;

import java.util.Scanner;
import java.util.Stack;

public class Demo_13_回忆迷宫 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        String substring = str.substring(0, N);
        char[] chars = substring.toCharArray();
        int height = 0;
        int wide = 0;
        boolean preIsU = false;
        boolean preIsL = false;
        Stack<Character> U_Stack = new Stack<>();
        Stack<Character> L_Stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'U'){
                if (preIsU || U_Stack.size() == 0){
                    height = Math.max(height,U_Stack.size() + 1);
                }
                U_Stack.push('U');
                preIsU = true;
            }else if (chars[i] == 'L'){
                if (preIsL || L_Stack.size() == 0){
                    wide = Math.max(wide,L_Stack.size() + 1);
                }
                L_Stack.push('L');
                preIsL = true;
            }else if (chars[i] == 'D'){
                U_Stack.pop();
                preIsU = false;
            }else if (chars[i] == 'R'){
                L_Stack.pop();
                preIsU = false;
            }
        }

//        System.out.println("height：" + (height + 1));
//        System.out.println("wide:" + (wide + 1));

    }
}
