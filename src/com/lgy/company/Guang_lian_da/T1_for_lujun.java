package com.lgy.company.Guang_lian_da;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-05-25 19:44
 */
public class T1_for_lujun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            end[i] = scanner.nextInt();
        }


    }
}
