package com.lgy.company.xiecheng;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-30 20:20
 */
public class T4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int[][] arr = new int[n - 1][2];

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(111);
    }
}
