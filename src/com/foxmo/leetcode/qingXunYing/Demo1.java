package com.foxmo.leetcode.qingXunYing;

import java.util.Scanner;
import java.util.Stack;

public class Demo1 {
    public static void main(String[] args) {
//        System.out.println((char) 65);
        Scanner scanner = new Scanner(System.in);
        int columnNumber = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while(columnNumber > 0){
            int remainder = columnNumber % 26;
            stack.push(remainder + 64);
            columnNumber = columnNumber / 26;
        }
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            System.out.print((char)stack.pop().intValue());
        }
    }
}
