package com.lgy.company.safe360;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-09 16:19
 */
public class T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];


        int score = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            score += arr[i];
        }
        scanner.close();

//        int a = 2;
//        int b = 3;
//        System.out.println(a|b);
        BigDecimal score1 =  new BigDecimal(score);
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                BigDecimal bigDecimal = BigDecimal.valueOf(arr[i] | arr[j]);
                score1.add(bigDecimal);
            }
        }
        System.out.println(score1);

    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//
//        Long score = 0l;
//        // int score = 0;
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//            score += arr[i];
//        }
//        scanner.close();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                int m = arr[i] | arr[j];
//                score += m;
//            }
//        }
//        System.out.println(score);
//
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long[] arr = new long[n];
//
//
//        Long score = 0l;
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextLong();
//            score += arr[i];
//        }
//        scanner.close();
//
////        int a = 2;
////        int b = 3;
////        System.out.println(a|b);
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                Long m = arr[i] | arr[j];
//                score += m;
//            }
//        }
//        System.out.println(score);
//
//    }
}
