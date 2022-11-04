//package com.lgy.company.Other;
//
//import sun.tools.jstat.Scale;
//
//import java.util.Scanner;
//
///**
// * @author LGY
// * @create 2022-05-18 20:05
// */
//public class T1_for_xunlin {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        String s = String.valueOf(n);
//
//        int[][] arr = new int[][]{
//                {0,1,1,1,1,1,0},
//                {0,0,1,1,0,0,0},
//                {0,1,1,0,1,1,1},
//                {0,1,1,1,1,0,1},
//                {1,0,1,1,0,0,1},
//                {1,1,0,1,1,0,1},
//                {1,1,0,1,1,1,1},
//                {0,1,1,1,0,0,0},
//                {1,1,1,1,1,1,1},
//                {1,1,1,1,1,0,1}
//        };
//
//        int sum = 0;
//
//        int int_0 = Integer.parseInt(s.substring(0, 1));
//        for (int i = 0; i < 7; i++) {
//            if (arr[int_0][i] == 1){
//                sum++;
//            }
//        }
//        for (int i = 1; i < s.length(); i++) {
//            int int_i = Integer.parseInt(s.substring(i, i+1));
//            int int_j = Integer.parseInt(s.substring(i-1,i));
//            for (int j = 0; j < 7; j++) {
//                if (arr[int_i][j] != arr[int_j][j]){
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
