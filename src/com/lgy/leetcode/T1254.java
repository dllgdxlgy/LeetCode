package com.lgy.leetcode;

import com.lgy.CodeTop_100.T200;

/**
 * @author LGY
 * @create 2022-05-12 14:44
 */
public class T1254 {

    public int closedIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // 这种情况不行，因为边界的也需要深度遍历，
        //如果只是把边界置为海洋，也有可能里面也需要被置为海洋。
//        for(int i = 0; i< m; i++){
//            grid[0][i] = 1;
//            grid[n-1][i] = 1;
//        }
//        for(int i = 0; i < n ;i++){
//            grid[i][0] = 1;
//            grid[i][m-1] = 1;
//        }

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
                if (grid[i][j] == 0) {
                    res++;
                    dfs(grid, i, j);
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
        if (arr[i][j] == 1) {
            return;
        }
        arr[i][j] = 1;
        dfs(arr, i - 1, j);
        dfs(arr, i, j - 1);
        dfs(arr, i, j + 1);
        dfs(arr, i + 1, j);
    }

//    public int closedIsland(int[][] grid) {
//        int n = grid.length;
//        int m = grid[0].length;
//
//        for(int i = 0; i< m; i++){
//            grid[0][i] = 1;
//            grid[n-1][i] = 1;
//        }
//        for(int i = 0; i < n ;i++){
//            grid[i][0] = 1;
//            grid[i][m-1] = 1;
//        }
//
//        int res = 0;
//        for(int i = 1; i < n; i++){
//            for(int j = 1; j < m; j++){
//                if(grid[i][j] == 0){
//                    res++;
//                    dfs(grid,i,j);
//                }
//            }
//        }
//        return res;
//    }
//
//    public void dfs(int[][] grid,int i ,int j){
//        if(i < 0 || j < 0|| i >= grid.length||j>= grid[0].length){
//            return;
//        }
//        if(grid[i][j] == 1){
//            return;
//        }
//        grid[i][j] = 1;
//        dfs(grid,i-1,j);
//        dfs(grid,i+1,j);
//        dfs(grid,i,j-1);
//        dfs(grid,i,j+1);
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = new int[][]{{0,0,1,1,0,1,0,0,1,0},
//                {1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},
//                {0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},
//                {1,1,1,0,1,1,0,1,1,0}};
//        com.lgy.CodeTop_100.T200 t200 = new T200();
//        int i = t200.closedIsland(arr);
//        System.out.println(i);
//    }
}
