package com.lgy.company.Other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-08-10 20:14
 */
public class T3_for_KCJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] nums = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int i = 0; i < n; i++) {
            int temp = int_val(arr[i], nums);
            System.out.println(temp);
        }
    }

    static List<List<Integer>> lists = new ArrayList<>();

    public static int int_val(int target, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            if(t*t*t*t > target){

            }
        }


        return 0;
    }
}
