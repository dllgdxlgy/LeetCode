package com.lgy.leetcode;

import java.util.Scanner;

/**
 * T0  01 背包
 * @author LGY
 * @create 2022-08-19 14:50
 */
public class beibao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_weight = scanner.nextInt();
        int[] arr_weight = new int[n];
        int[] arr_value = new int[n];
        for(int i = 0;i<n;i++){
            arr_weight[i] = scanner.nextInt();
            arr_value[i] = scanner.nextInt();
        }
        int[][] dp = new int[n+1][max_weight+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= max_weight ; j++) {
                if (j < arr_weight[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr_weight[i - 1]]+arr_value[i - 1]);
                }
            }
        }

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <=max_weight ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    


}
