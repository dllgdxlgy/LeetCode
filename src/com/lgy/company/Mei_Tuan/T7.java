package com.lgy.company.Mei_Tuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/question/next?pid=28665338&qid=1371126&tid=53396162
 */
public class T7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().trim().split("");
        int T = Integer.parseInt(strings[0]);

        for (int i = 0; i < T; i++) {

            String[] strings1 = scanner.nextLine().trim().split("");
            int cookie_num = Integer.parseInt(strings[0]);
            int[] arr = new int[cookie_num];
            String[] strings2 = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < strings2.length; j++) {
                arr[i] = Integer.parseInt(strings2[i]);
            }
            int num = max_meiwei(cookie_num, arr);
            System.out.println(num);
        }
    }
    public static int max_meiwei(int num, int[] arr){

        Arrays.sort(arr);
        int max = arr[num-1];
        for (int i = 0; i < num-1; i++) {
            for (int j = 0; j < num-1; j++) {
                arr[j] +=arr[j+1];
                arr[num-1]+=arr[j];
            }

        }
        return 0;
    }
}
