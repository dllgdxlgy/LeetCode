package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-05 20:03
 */
public class T62 {

    public int uniquePaths(int m, int n) {

        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }

        for (int i = 0; i < m  ; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j] == 0 ){
                    arr[i][j] = arr[i][j-1]+arr[i-1][j];
                }
            }
        }

        return arr[m-1][n-1];
    }

    public int uniquePaths_1(int m, int n) {

        int[][] arr = new int[m][n];

        for (int i = 0; i < m  ; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0){
                    arr[i][j] =1;
                }
                if (arr[i][j] == 0 ){
                    arr[i][j] = arr[i][j-1]+arr[i-1][j];
                }
            }
        }

        return arr[m-1][n-1];
    }

}
