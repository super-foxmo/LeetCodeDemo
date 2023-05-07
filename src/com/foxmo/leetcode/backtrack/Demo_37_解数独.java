package com.foxmo.leetcode.backtrack;

public class Demo_37_解数独 {
    public static void main(String[] args) {
        solveSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});

    }

    public static void solveSudoku(char[][] board) {
        backtrack(board);
    }

    public static boolean backtrack(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.'){ // 跳过原始数字
                    continue;
                }
                for (char c = '1'; c <= '9'; c++) {
                    if (isLegal(i, j, c, board)) {
                        board[i][j] = c;
                        boolean result = backtrack(board);
                        if (result) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isLegal(int i, int j, char c, char[][] board) {
        for (int k = 0; k < board[i].length; k++) {
            if (board[i][k] != '.' && board[i][k] == c) {
                return false;
            }
        }
        for (int k = 0; k < 9; k++) {
            if (board[k][j] != '.' && board[k][j] == c) {
                return false;
            }
        }
        // 9宫格里是否重复
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
        for (int k = startRow; k < startRow + 3; k++) {
            for (int l = startCol; l < startCol + 3; l++) {
                if (board[k][l] == c) {
                    return false;
                }
            }
        }
//        if (i < 3){
//            if (j < 3){
//                return isValue(3,3,c,board);
//            }else if (j < 6){
//                return isValue(3,6,c,board);
//            }else if (j < 9){
//                return isValue(3,9,c,board);
//            }
//        }else if (i < 6){
//            if (j < 3){
//                return isValue(6,3,c,board);
//            }else if (j < 6){
//                return isValue(6,6,c,board);
//            }else if (j < 9){
//                return isValue(6,9,c,board);
//            }
//        }else if (i < 9){
//            if (j < 3){
//                return isValue(9,3,c,board);
//            }else if (j < 6){
//                return isValue(9,6,c,board);
//            }else if (j < 9){
//                return isValue(9,9,c,board);
//            }
//        }
        return true;
    }

    public static boolean isValue(int i, int j, char c, char[][] board) {
        for (int k = i - 3; k < i; k++) {
            for (int l = j - 3; l < j; l++) {
                if (board[k][l] != '.' && board[k][l] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
