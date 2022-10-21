package com.lgy.company.kuaishou;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-21 19:38
 */
public class T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[n][n];
        dp[0][0] = arr[0][0];

        int res = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + arr[i][0];
            res = Math.max(res,arr[i][0]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[j][i] = Math.max(dp[j-1][i-1],dp[j-1][i])+arr[j][i];
                res =Math.max(res,dp[j][i]);
            }
        }
        System.out.println(res);
    }
}
