package com.lgy.company.weilai;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-07-31 14:14
 */
public class T1_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0;i<n;i++){
            for(int j = 0 ; j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0;i<n;i++){
            System.out.println(isSuccess(arr[i]));
        }

    }

    private static String isSuccess(int[] arr) {
        int x = Math.max(arr[0],arr[1]);
        int y = Math.min(arr[0],arr[1]);
        if(x-y == y || x-y==x){
            return "B";
        }
        if(x%2 == 0&& y%2 ==0){
            if((x/2-2)%2 == 1){
                return "B";
            }else {
                return "A";
            }
        }else {
            int temp = x-y;
            temp+=y-1;
            if(temp % 2 == 1) {
                return "B";
            }else {
                return "A";
            }
        }

    }

//    private static String isSuccess(int[] arr) {
//        int x = arr[0];
//        int y = arr[1];
//
//        int temp = Math.max(x,y)-Math.min(x,y);
//        temp+=(Math.min(x,y)-1);
//        if(temp % 2 == 1) {
//            return "B";
//        }else {
//            return "A";
//        }
//    }
}
