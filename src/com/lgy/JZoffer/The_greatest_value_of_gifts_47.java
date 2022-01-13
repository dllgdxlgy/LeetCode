package com.lgy.JZoffer;

/**
 * 礼物的最大价值
 *
 * @author LGY
 * @create 2022-01-13 20:24
 */
public class The_greatest_value_of_gifts_47 {

    /**
     * 方法一
     *
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                }else if (j == 0) {
                    grid[i][j] += grid[i-1][j];
                }else {
                    grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
                }

            }
        }
        return grid[m-1][n-1];
    }

    /**
     * 方法二.多添加一行一列
     *
     * @param grid
     * @return
     */
    public int maxValue_1(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        //dp[i][j]表示从grid[0][0]到grid[i - 1][j - 1]时的最大价值
        int[][] dp = new int[row + 1][column + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[row][column];

    }
}
