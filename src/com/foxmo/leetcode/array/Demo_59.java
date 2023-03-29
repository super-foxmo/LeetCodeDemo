package com.foxmo.leetcode.array;

/*给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。*/

public class Demo_59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int row = 0, column = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 右下左上
        int directionIndex = 0;
        int nextrow,nextcolumn;
        for(int min = 1 ; min <= n * n; min++){
            matrix[row][column] = min;
            nextrow = row + directions[directionIndex][0];
            nextcolumn = column + directions[directionIndex][1];
            if(nextrow < 0 || nextrow >= n || nextcolumn < 0 || nextcolumn >= n || matrix[nextrow][nextcolumn] != 0){
                directionIndex = (directionIndex + 1) % 4;
            }
            row = row + directions[directionIndex][0];
            column = column + directions[directionIndex][1];
        }

        return matrix;
    }
}
