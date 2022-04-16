package com.lgy.company.Mei_Tuan;

import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int res = 0;
        if (n == 1){
            System.out.println(0);
            return;
        }

        int big = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] >= big){
                big = arr[i];
                index = i;
            }
        }
        if (index == n-1){
            System.out.println(res);
            return;
        }

        for (int i = index; i > 0 ; i--) {
            if (arr[i] < arr[i-1]){
                for (int j = i; j < index ; j++) {
                    res +=arr[i-1] - arr[i] +1;
                    arr[i]=arr[i-1]+1;
                }

            }
        }

        for (int i = n-1; i > index; i--) {
            if (arr[i] > arr[i-1]){
                for (int j = i; j > index ; j--) {
                    res += arr[i] - arr[i-1] +1;
                    arr[i-1]=arr[i]+1;
                }

            }
        }
        System.out.println(res);
        
    }
}
