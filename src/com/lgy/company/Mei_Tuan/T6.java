package com.lgy.company.Mei_Tuan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.nowcoder.com/question/next?pid=28665338&qid=1371123&tid=53389097
 * 晋级人数
 */
public class T6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n-1] == 0){
            System.out.println(0);
        }
        int num = x;
        if (arr[n-x] == 0){
            num--;
            int i = n-x+1;
            while (i<=n-1){
                if (arr[i] == 0)
                    num--;
            }
        }else {
            for (int i = 0; i < n-x; i++) {
                if (arr[i] == arr[n-x]){
                    num++;
                }
            }
        }
        System.out.println(num);
    }

}
