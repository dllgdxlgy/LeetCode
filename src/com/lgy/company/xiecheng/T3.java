package com.lgy.company.xiecheng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-30 19:49
 */
public class T3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] temp = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i] = Math.abs(arr[i]-arr[i-1]);
        }
        Arrays.sort(temp);
        System.out.println(temp[n-3]);

    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        scanner.close();
//
//        int[] dp = new int[n];
//        int max = -1;
//        for (int i = 1; i < n; i++) {
//            dp[i] = Math.abs(arr[i] - arr[i - 1]);
//            max = Math.max(max, dp[i]);
//        }
//        for (int i = 1; i < n; i++) {
//            if(dp[i] == dp[i-1] && dp[i] == max){
//                if(arr[i]<0&&arr[i-1]>0 || arr[i]>0 && arr[i-1]<0){
//                    Arrays.sort(dp);
//                    System.out.println(dp[n-3]);
//                    break;
//                }
//            }
//        }
//        Arrays.sort(dp);
//        System.out.println(dp[n-2]);
//    }
}
