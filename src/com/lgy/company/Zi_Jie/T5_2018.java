package com.lgy.company.Zi_Jie;

import java.util.Scanner;

public class T5_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int query = sc.nextInt();
        int[][] queay_sum = new int[query][3];
        for (int i = 0; i < query; i++) {
            for (int j = 0; j < 3; j++) {
                queay_sum[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < query; i++) {
            System.out.println(query_for(arr, queay_sum[i]));

        }
    }
    public static int query_for(int[] query, int[] arr){
        int count = 0;
        for (int i = arr[0]-1; i <= arr[1] ; i++) {
            if (arr[2] == query[i]){
                count++;
            }
        }
        return count;
    }


}
