package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-12 14:05
 */
public class T200 {

    public int numIslands(char[][] grid) {

        int res = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] arr, int i, int j) {
        int m = arr.length;
        int n = arr[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (arr[i][j] == '0') {
            return;
        }
        arr[i][j] = '0';

        dfs(arr, i + 1, j);
        dfs(arr, i, j + 1);
        dfs(arr, i - 1, j);
        dfs(arr, i, j - 1);

    }

    public static void main(String[] args) {
        char[][] arr = new char[][]{{'1','1','1','1','1','1','1','0'},{'1','0','0','0','0','1','1','0'},
                {'1','0','1','0','1','1','1','0'},{'1','0','0','0','0','1','0','1'},{'1','1','1','1','1','1','1','0'}};
        T200 t200 = new T200();
        int i = t200.numIslands(arr);
        System.out.println(i);
    }

}

