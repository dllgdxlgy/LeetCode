package com.lgy.company.wangyi;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-16 14:58
 */
public class T1_2022 {
    public static int bf(int[] arr, int tar) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] <= tar) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4 * n; j++) {
                if (j < n && i < (n - j)) {
                    System.out.print(".");
                } else if ((4 * n - j) <= n && i <= j % n) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        for (int i = 0; i < 2*n; i++) { // zxiug
            for (int j = 0; j < 4 * n; j++) {
                if (j / n == 0 || j / n == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 4 * n; j++) {
                if (j < n && i < (n - j)) {
                    System.out.print(".");
                } else if ((4 * n - j) <= n && i <= j % n) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}


