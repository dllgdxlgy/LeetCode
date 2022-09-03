package com.lgy.company.xinghuan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-03 17:27
 */
public class T2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        scanner.close();
    }
}
