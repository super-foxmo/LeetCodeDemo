package com.foxmo.leetcode.hash;

import java.util.HashMap;
import java.util.HashSet;

public class Demo_202_快乐数 {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 || !set.contains(n)) {
            set.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    private int getNextNum(int n) {
        int ans = 0;
        while (n % 10 != 0) {
            int temp = n % 10;
            ans += temp * temp;
            n = n / 10;
        }
        return ans;
    }
}
