package com.lgy.Hot_xiu_108.Array;

/**
 * 8. 矩阵的最小路径和
 https://www.nowcoder.com//practice/7d21b6be4
 c6b429bb92d219341c4f8bb?tpId=190&&tqId=35224
 &rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-07 15:39
 */
public class T8 {


    /**
     * 自己做的
     * @param matrix
     * @return
     */
    public int minPathSum (int[][] matrix) {
        // write code here

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];
        dp[0][0] = matrix[0][0];
        for(int i = 1; i < col; i++){
            dp[0][i] = dp[0][i-1]+matrix[0][i];
        }
        for(int i = 1; i < row; i++){
            dp[i][0] = dp[i-1][0]+matrix[i][0];
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

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3,3,1,6,7,6,0,7,8,0},
                {5,0,5,0,5,3,9,8,0,4},
                {2,8,8,9,0,6,8,7,6,7},
                {6,1,0,9,0,9,6,0,6,6},
                {2,3,6,9,5,3,2,4,3,4},
                {1,5,2,1,4,5,8,4,2,6},
                {3,0,0,5,0,0,4,6,2,2},
                {4,6,6,2,5,1,7,9,8,0},
                {3,1,7,7,2,4,2,0,8,6},
                {9,4,7,9,9,7,1,4,5,5}};

        T8 t8 = new T8();
        int i = t8.minPathSum(arr);
        System.out.println(i);
    }
}
