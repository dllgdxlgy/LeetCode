package com.lgy.company.Mei_Tuan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-03-26 08:53
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        // 记录第一个大于等于 0 的位置
        int m  = 0;
        int sum = 0;

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0){
                sum += arr[i];
                if (flag){
                    m = i;
                    flag = false;
                }
            }
        }
        if (sum % 7 == 0){
            System.out.println(sum);
        }else {
            for (int j = 0;j < m;j++){
                if ((sum+arr[j]) % 7 == 0){
                    System.out.println(sum+arr[j]);
                    break;
                }
            }
        }
        for (int k = m; k <n;k++){
           int temp = sum;
           if ((temp-=arr[k])%7 == 0){
               System.out.println(temp);
           }
        }
    }
}
