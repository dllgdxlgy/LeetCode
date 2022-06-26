package com.lgy.Hot_xiu_108.DFS;

/**
 * T11. 矩阵最长递增路径

 https://www.nowcoder.com/practice/7a71a88cdf294ce6bdf54c899be967a2?tpId=190&&tqId=36044&
 rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-26 20:45
 */
public class T11 {


    public int solve (int[][] matrix) {
        // write code here
        int max = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i < n; i++){
            for(int j = 0; j < m; j++){
                max = Math.max(max,dfs(matrix,i,j,-1));
            }
        }
        return max;
    }

    public int dfs(int[][] arr, int i, int j,int pre){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
            return -1;
        }
        if(arr[i][j] <= pre){
            return 0;
        }
        int max = 0;
        max = Math.max(max,dfs(arr,i-1,j,arr[i][j]));
        max = Math.max(max,dfs(arr,i,j-1,arr[i][j]));
        max = Math.max(max,dfs(arr,i,j+1,arr[i][j]));
        max = Math.max(max,dfs(arr,i+1,j,arr[i][j]));
        return max +1;

    }
}
