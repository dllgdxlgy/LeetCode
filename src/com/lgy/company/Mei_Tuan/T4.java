package com.lgy.company.Mei_Tuan;

import java.util.Arrays;
import java.util.Scanner;

//https://www.nowcoder.com/question/next?pid=28665343&qid=1371127&tid=53130572
public class T4 {
    public static void main(String[] args) {
        T4 t4 = new T4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int res = t4.Regular_sequence(arr,n);
        System.out.println(res);

    }

    public int Regular_sequence(int[] arr, int n){
        int res = 0;
        for (int i = 1; i < n+1; i++) {
            res +=Math.abs(i-arr[i-1]);

        }
        return res;

    }
}
