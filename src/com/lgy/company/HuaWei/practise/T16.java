package com.lgy.company.HuaWei.practise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 08:47
 */
public class T16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int num = sc.nextInt();
        int[][] arr = new int[num][3];
        for(int i = 0; i<num;i++){
            for(int j = 0; j< 3;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("wancheng");
    }
}
