package com.foxmo.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo_51_N皇后 {
    static List<List<String>> lists = new ArrayList<>();


    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] c : chessboard) {
            Arrays.fill(c, '.');
        }
        backtrack(chessboard,n,0);
    }

    public void backtrack(char[][] chessboard,int n,int row){
        if (row == n){
            lists.add(Array2List(chessboard));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isLegal(row,i,chessboard,n)){
                chessboard[row][i] = 'Q';
                backtrack(chessboard,n,row + 1);
                chessboard[row][i] = '.';
            }
        }
    }

    public List Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();

        for (char[] c : chessboard) {
            list.add(String.copyValueOf(c));
        }
        return list;
    }

    public boolean isLegal(int row,int i,char[][] chessboard,int n){
        for (int j = row - 1,count = 1; j >= 0; j--,count++) {
            if (chessboard[j][i] == 'Q'){
                return false;
            }else if ((i - count) >= 0 && chessboard[j][i - count] == 'Q'){
                return false;
            }else if ((i + count) < n && chessboard[j][i + count] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
