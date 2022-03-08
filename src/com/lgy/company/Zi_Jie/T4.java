package com.lgy.company.Zi_Jie;

import java.util.Arrays;
import java.util.Scanner;

//给一个数组，给一个整数M，需要找出数组中的两数和小于等于M的个数。
//键盘输入的数组是一行，M在第二行，
public class T4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings =  scanner.nextLine().trim().split(" ");
        int m = scanner.nextInt();
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length ; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] +arr[j] <= m){
                    ++res;
                }
            }
        }
        System.out.println(res);

        
    }
}
