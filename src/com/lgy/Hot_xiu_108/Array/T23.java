package com.lgy.Hot_xiu_108.Array;

import java.util.Arrays;

/**
 *23. 带权值的最小路径和
 https://www.nowcoder.com//practice/23462ed010024fcabb7dbd3df57c7
 15e?tpId=190&&tqId=35189&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking

 * @author LGY
 * @create 2022-06-11 17:15
 */
public class T23 {


    /**
     * 自己做的
     * @param grid
     * @return
     */

    public int minPathSum (int[][] grid) {
        // write code here
        int n = grid.length;
        int m = grid[0].length;
        int[][] res = new int[n][m];
        res[0][0] = grid[0][0];
        for(int i = 1; i < m ;i++){
            res[0][i] = grid[0][i] + res[0][i-1];
        }
        for(int i = 1; i < n; i++){
            res[i][0] = grid[i][0] + res[i-1][0];
        }
        if(n >= 2 && m >= 2){
            for(int i = 1; i < n; i++){
                for(int j = 1; j< m; j++){
                    res[i][j] = Math.min(res[i-1][j],res[i][j-1])+grid[i][j];
                }
            }
        }
        return res[n-1][m-1];
    }



    /**
     * 递归 + 备忘录
     *
     * @param grid
     * @return
     */
    int[][] arr;
    public int minPathSum_1(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        arr = new int[n][m];

        for(int[] r : arr){
            Arrays.fill(r,-1);
        }
        return dp(grid,n-1,m-1);
    }

    public int dp(int[][] grid, int n ,int m){
        if(n == 0 && m == 0){
            return grid[0][0];
        }
        if(n < 0 || m < 0){
            return Integer.MAX_VALUE;
        }
        if(arr[n][m] != -1){
            return arr[n][m];
        }
        arr[n][m] = Math.min(dp(grid,n-1,m),dp(grid,n,m-1))+grid[n][m];
        return arr[n][m];
    }
}
