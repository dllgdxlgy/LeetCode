package com.lgy.company.kuaishou;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-21 19:19
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().trim().split(" " );
        int[][] arr  = new int[1][s.length];
        int[][] arr1 = new int[2][s.length];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < s.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < s.length; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println(0);
    }
}
