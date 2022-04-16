package com.lgy.company.pinduoduo;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-10 19:43
 */
public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[m-1]%n != 0){
            System.out.println(arr[m-1]/n+1);
        }else {
            System.out.println(arr[m-1]/n);
        }

    }
}
