package com.lgy.Hot_xiu_108.DFS;

/**
 * @author LGY
 * @create 2022-06-24 13:34
 */
public class T2 {

    public int solve (char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // write code here
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(char[][] arr, int i,int j){
        if(i<0 || i>=arr.length || j<0 || j >= arr[0].length || arr[i][j] == '0'){
            return;
        }
        arr[i][j] ='0';
        dfs(arr,i,j-1);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i+1,j);

    }
}
