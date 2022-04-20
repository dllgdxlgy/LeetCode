package com.lgy.company.BaiDu;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-19 19:57
 */
public class T2_2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int index = scanner.nextInt();
        index = index-1;

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[index] == 0){
            System.out.println(0);
            return;
        }

        int left = index-1;
        int right = index + 1;
        int sum = 0;

        while ( left >= 0 && arr[left] > 1){
            if (arr[left+1] >= arr[left] ){

                left--;
            }else {
                arr[left]=arr[left+1];

                left--;
            }

        }
        if (arr[left+1] == 1){
            sum++;

        }
        while (right < N && arr[right]!=1 ){
            if (arr[right] <= arr[right-1]){

                right++;
            }else {
                arr[right] =arr[right-1];

                right++;
            }
        }
        if (arr[right] == 1){
            sum++;
        }

        for (int i = left+1; i < right; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

//    public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            int N = scanner.nextInt();
//
//            int index = scanner.nextInt();
//            index = index-1;
//            int[] arr = new int[N];
//            for (int i = 0; i < N; i++) {
//                arr[i] = scanner.nextInt();
//            }
//            if (arr[index] == 0){
//                System.out.println(0);
//                return;
//            }
//            int left = index-1;
//            int right = index + 1;
//            int sum = 0;
//
//            while ( left >= 0 ){
//                if (arr[left+1] >= arr[left]){
//
//                    left--;
//                }else {
//                    arr[left]=arr[left+1];
//
//                    left--;
//                }
//
//            }
//            while (right<N){
//                if (arr[right]<=arr[right-1]){
//
//                    right++;
//                }else {
//                    arr[right] =arr[right-1];
//                    right++;
//                }
//            }
//
//            for (int i = 0; i < N; i++) {
//                sum+=arr[i];
//            }
//            System.out.println(sum);
//        }
}
