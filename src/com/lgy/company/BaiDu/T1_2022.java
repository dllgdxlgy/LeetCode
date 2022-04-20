package com.lgy.company.BaiDu;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-19 19:50
 */
public class T1_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
