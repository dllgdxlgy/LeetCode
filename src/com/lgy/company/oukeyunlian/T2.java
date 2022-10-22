package com.lgy.company.oukeyunlian;

/**
 * @author LGY
 * @create 2022-10-22 14:47
 */
public class T2 {

    public int planStock (int[][] order, int balance) {
        for (int i = 0; i < order.length; i++) {
            order[i][0] = order[i][0] * order[i][1];
        }

        int len = order.length;

        int[][] dp = new int[len][balance+1];

        for (int i = order[0][0]; i <= balance; i++) {
            dp[0][i] = order[0][1];
        }

        for (int i = 1; i < len; i++) {
            for (int j = 0; j <= balance; j++) {
                if(j < order[i-1][0]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-order[i-1][0]])+order[i-1][1];
                }

            }
        }

        return dp[len-1][balance];
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{2,2},{3,4}};
        T2 t2 = new T2();
        int i = t2.planStock(arr, 4);
    }
}
