package com.lgy.company.HuaWei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-13 18:54
 */
public class T3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        // 如果为奇数，就返回
        if (sum % 2 == 1){
            System.out.println("-1");
            return;
        }

        Arrays.sort(arr);
        int temp = 0;
        int halfSum = sum/2 ;
        for (int i = 0; i < n; i++) {

            if (temp == halfSum){

            }
        }




    }

}
