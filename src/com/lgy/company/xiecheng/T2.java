package com.lgy.company.xiecheng;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-30 19:32
 */
public class T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.println(number(arr[i]));
        }
    }

    public static int number(int[] arr) {
        int res = 0;
        int y_num = arr[0];
        int o_num = arr[1];
        int u_num = arr[2];
        int you_num = Math.min(Math.min(y_num, o_num), u_num);
        y_num -= you_num;
        o_num -= you_num;
        u_num -= you_num;
        res += 2 * you_num;
        if(o_num >=2){
            res+=(o_num/2);
        }
        return res;
    }
}
