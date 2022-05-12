package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-12 15:23
 */
public class T1020 {


    public int numEnclaves(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for (int j = 0; j < n; j++) {
            dfs(grid,0,j);
            dfs(grid,m-1,j);
        }
        for (int i = 0; i < m; i++) {
            dfs(grid,i,0);
            dfs(grid,i,n-1);
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(int[][] arr, int i, int j) {
        int m = arr.length;
        int n = arr[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (arr[i][j] == 0) {
            return;
        }
        arr[i][j] = 0;
        dfs(arr, i - 1, j);
        dfs(arr, i, j - 1);
        dfs(arr, i, j + 1);
        dfs(arr, i + 1, j);
    }
}
