package com.lgy.company.xinghuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-03 18:14
 */
public class T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int h = scanner.nextInt();
        int[][] temp = new int[l][h];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < h; j++) {
                temp[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n-1; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            int[][] arr = new int[row][col];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }
            System.out.println(compare(temp,arr));

        }
    }

    public static boolean compare(int[][] temp,int[][] temp1){
        int temp_r = temp.length;
        int temp_h = temp[0].length;
        int temp1_r = temp1.length;
        int temp1_h = temp1[0].length;
        if(temp_r == temp1_r && temp_h == temp1_h){
            if(num(temp) == num(temp1)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public static int num(int[][] temp){
        int res = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                if(temp[i][j] == 1){
                    res++;
                }
            }
        }
        return res;
    }


}
