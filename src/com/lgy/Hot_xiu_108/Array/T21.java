package com.lgy.Hot_xiu_108.Array;

/**
 * 21. 矩阵乘法
 *
 https://www.nowcoder.com//practice/bf358c3ac73e491585943bac94e
 309b0?tpId=190&&tqId=36251&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-11 16:37
 */
public class T21 {


    /**
     * 自己做的
     * @param a
     * @param b
     * @return
     */
    public int[][] solve (int[][] a, int[][] b) {
        // write code here
        int n = a.length;
        int[][] res = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = sum_n(a,b,i,j);
            }
        }
        return res;
    }

    public int sum_n (int[][] a, int[][] b,int i,int j){
        int n = a.length;
        int sum = 0;
        for(int k = 0; k < n; k++){
            sum = sum+ (a[i][k] * b[k][j]);
        }
        return sum;
    }

}
