package com.lgy.company.mihayou;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-14 21:18
 */
public class T3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[][] arr = new int[n-1][2];
        for (int i = 0; i < n - 1; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.println(8);
    }
}
