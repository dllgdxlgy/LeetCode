package com.lgy.company.HuaWei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-13 19:21
 */
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                int y = scanner.nextInt();
                int v = scanner.nextInt();
                arr[i][0] = y;
                arr[i][1] = v;
            }
            System.out.println(arr);
        }
    }


}

