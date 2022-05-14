package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-12 15:35
 */
public class T695 {

    public int maxAreaOfIsland(int[][] grid) {

        int res = 0;
        int m = grid.length;
        int n = grid[0].length;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(dfs(grid, i, j), res);
                }
            }
        }
        return res;
    }

    public int dfs(int[][] arr, int i, int j) {

        int m = arr.length;
        int n = arr[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 0;
        }
        if (arr[i][j] == 0) {
            return 0;
        }

        arr[i][j] = 0;

        return dfs(arr, i - 1, j) + dfs(arr, i, j - 1) + dfs(arr, i + 1, j) + dfs(arr, i, j + 1)+1;
    }

}
