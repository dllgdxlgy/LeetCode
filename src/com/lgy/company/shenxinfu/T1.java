package com.lgy.company.shenxinfu;

/**
 * @author LGY
 * @create 2022-09-01 19:13
 */
public class T1 {

    int res;

    public int ncov_defect(int[][] grid) {

        if(grid == null || grid.length == 0){
            return res;
        }
        // write code here
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, 0);
                }
            }
        }

        return res;
    }

    public void dfs(int[][] arr, int i, int j, int num) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || num > 1) {
            return;
        }

        if (arr[i][j] == 0) {
            res++;
            arr[i][j] = -1;
            num++;
        }
        dfs(arr, i - 1, j, ++num);
        --num;
        dfs(arr, i, j + 1, ++num);
        --num;
        dfs(arr, i + 1, j, ++num);
        --num;
        dfs(arr, i, j - 1, ++num);
        --num;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 1, 0, 0, 0, 0, 0, 1}, {0, 1, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0, 0, 0}};
        T1 t1 = new T1();
        int i = t1.ncov_defect(arr);
        System.out.println(i);
    }
}
