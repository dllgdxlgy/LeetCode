package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-06 11:18
 */
public class T2_for_KCJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(arr[left] <0){
            left++;
        }
        while(arr[right] >0){
            right--;
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = left; i < right; i++) {
            if(num(arr,left,i,right)<min){
                index = i;
                min = num(arr,left,i,right);
            }

        }
        System.out.println(index+1);
    }
    public static  int num(int[] arr ,int left,int i,int right){
        int res = 0;
        while(left<=i){
            if(arr[left]>=0){
                res++;
            }
            left++;
        }
        int t = i+1;
        while(t<=right){
            if(arr[t] <=0){
                res++;
            }
            t++;
        }
        return res;
    }
}
