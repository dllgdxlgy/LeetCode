package com.lgy.company.Zi_Jie;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 10:18
 */
public class T6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int user_num = sc.nextInt();
        int[] arr = new int[user_num];
        for(int i = 0;i<user_num;i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[][] arr_query = new int[n][3];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<3;j++){
                arr_query[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(query_num(arr,arr_query[i][0],arr_query[i][1],arr_query[i][2]));
        }
    }

    public static int query_num(int[] arr,int i, int j, int num){
        int left = i-1;
        int right = j-1;
        int res = 0;
        while(left <= right){
            if(arr[left] == num){
                res++;
            }
            left++;
        }
        return res;
    }
}
