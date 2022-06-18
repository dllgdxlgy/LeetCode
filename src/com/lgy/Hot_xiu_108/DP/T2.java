package com.lgy.Hot_xiu_108.DP;

/**
 * @author LGY
 * @create 2022-06-18 14:59
 */
public class T2 {

    public int minPathSum (int[][] matrix) {
        // write code here

        // 获取行的长度
        int row = matrix.length;
        // 获取列的数量
        int col = matrix[0].length;

        int[][] dp = new int[row][col];
        dp[0][0] = matrix[0][0];
        for(int i = 1; i < col; i++){
            dp[0][i] = dp[0][i-1] + matrix[0][i]; // 为第一行进行赋值
        }
        for(int i = 1; i < row; i++){
            dp[i][0] = dp[i-1][0]+matrix[i][0]; // 为第一列进行赋值
        }
        if(row>1 && col>1){
            for(int i = 1; i < row; i++){
                for(int j = 1; j< col; j++){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+matrix[i][j];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
