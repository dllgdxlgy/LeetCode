package com.lgy.company.wangyi;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-16 15:30
 */
public class T4_2022 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int tem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int plu = plu(arr, i, j);
                tem +=plu;

            }
        }
        for (int i = 0; i < n; i++) {
            tem += ziji(arr,i);
        }
        System.out.println(tem);
    }

    public static int plu (int[] nums, int start, int right){
        int p = 1;
        int res = 0;
        for (int i = start; i <= right ; i++) {
            p*=nums[i];
        }
        while ( p % 10  == 0 && p != 1){
            res++;
            p = p/10;
        }
        return res;
    }
    public static int ziji(int[] num,int i){
        int p = num[i];
        int res = 0;
        while (p % 10 == 0 && p != 1){
            res++;
            p = p/10;
        }
        return res;
    }
}
