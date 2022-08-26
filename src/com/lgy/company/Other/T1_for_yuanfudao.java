package com.lgy.company.Other;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-26 15:49
 */
public class T1_for_yuanfudao {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int mid = n/2;
        for(int i = 0;i < m;i++){
            arr = change(arr,mid);
        }
        for(int i = 0;i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] change(int[] arr, int index){
        int[] res = new int[arr.length];
        int j = 0;
        for(int i = 0; i < index; i++){
            res[j++] = arr[index+i];
            res[j++] = arr[i];
        }
        if(arr.length%2 == 1){
            res[arr.length-1] = arr[arr.length-1];
        }
        return res;
    }
}
