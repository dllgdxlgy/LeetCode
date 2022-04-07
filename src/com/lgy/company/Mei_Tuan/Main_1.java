package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-03-26 17:08
 */
public class Main_1 {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[][] dp = new int[n+1][7];
        dp[0][0]=0;
        for(int i=1;i<7;i++){
            dp[0][i]=-0xfffffff;
        }
        for(int i=1;i<=n;i++){
            int x = arr[i-1]%7;
            for(int j=0;j<7;j++){
                dp[i][j]=Math.max(dp[i][j],dp[i-1][(7-x+j)%7]+arr[i-1]);
            }
        }
        System.out.println(dp[n][0]);

    }
}

