package com.lgy.company.weilai;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 14:51
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[4][n];
        for(int i = 0;i<3;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            arr[3][i] = arr[1][i]-arr[0][i];
        }




    }
}
