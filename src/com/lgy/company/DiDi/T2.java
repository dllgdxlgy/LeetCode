package com.lgy.company.DiDi;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-17 15:53
 */
public class T2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        int[][] arr = new int[3][n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
//        System.out.println(1);

//        for
    }
}
