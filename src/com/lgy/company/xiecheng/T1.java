package com.lgy.company.xiecheng;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-30 19:04
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.println(isNumS(arr[i]));
            }
        }

    }

    public static int isNumS(int num) {

        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int index = -1;
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if ((chars[i] - '0') % 2 == 0) {
                index = i;
                sb.append(chars[i]);
            } else {
                sb.insert(0, chars[i]);
            }
        }
        int temp = Integer.parseInt(sb.toString());
        if(temp % 2 == 0){
            return temp;
        }else {
            return -1;
        }

    }

//    public static int isNumS(int num) {
//
//        StringBuilder sb = new StringBuilder();
//        String s = String.valueOf(num);
//        char[] chars = s.toCharArray();
//        int index = -1;
//        int len = chars.length;
//        for (int i = 0; i < len; i++) {
//            if ((chars[i] - '0') % 2 == 0) {
//                index = i;
//                break;
//            }
//        }
//        if(index == -1){
//            return -1;
//        }else {
//            String res = sb.append(s).deleteCharAt(index).append(chars[index]).toString();
//            return Integer.parseInt(res);
//        }
//
//    }

//    public static int isNumS(int num) {
//
//        StringBuilder sb = new StringBuilder();
//        String s = String.valueOf(num);
//        char[] chars = s.toCharArray();
//
//        int len = chars.length;
//        for (int i = 0; i < chars.length; i++) {
//            if ((chars[i] - '0') % 2 == 0) {
//
//                sb.append(chars[i]);
//            } else {
//                sb.insert(0, chars[i]);
//            }
//        }
//
//        if(Integer.parseInt(sb.toString()) % 2 == 0){
//            return Integer.parseInt(sb.toString());
//        }else {
//            return -1;
//        }
//
//    }
}
