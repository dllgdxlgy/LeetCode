package com.lgy.Hot_xiu_108.BFS;

/**
 * T1. 岛屿数量
 https://leetcode-cn.com/problems/number-of-islands/
 * @author LGY
 * @create 2022-06-26 23:33
 */
public class T1 {

    int num = 0;
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0;i < n;i++){
            for(int j = 0; j < m;j++){
                if(grid[i][j] == '1'){
                    num++;
                    dfs(grid,i,j);
                }
            }
        }
        return num;
    }

    public void dfs(char[][] arr, int i, int j){
        if(i<0 || i >= arr.length || j<0 || j>=arr[0].length){
            return;
        }
        if(arr[i][j] == '0'){
            return;
        }
        arr[i][j] = '0';
        dfs(arr,i-1,j);
        dfs(arr,i,j-1);
        dfs(arr,i+1,j);
        dfs(arr,i,j+1);
    }
}
