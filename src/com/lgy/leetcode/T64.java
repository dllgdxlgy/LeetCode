package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-05 20:59
 */
public class T64 {

    public int minPathSum(int[][] grid) {

        int row = grid.length;
        int width = grid[0].length;
        int[][] arr = new int[row][width];

        arr[0][0] = grid[0][0];
        for (int i = 1; i < row; i++) {
            arr[i][0] = grid[i][0] + arr[i-1][0];
        }
        for (int i = 1; i < width; i++) {
            arr[0][i] = arr[0][i-1]+grid[0][i];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < width; j++) {
                arr[i][j] = Math.min(arr[i-1][j],arr[i][j-1])+grid[i][j];
            }
        }
    return arr[row-1][width-1];

    }
}
