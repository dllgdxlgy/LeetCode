package com.lgy.company.BIanLiFeng;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-14 16:47
 */
public class T1 {



    //////
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] split_n = scanner.nextLine().trim().split(" ");
        String[] split_m = scanner.nextLine().trim().split(" ");
        String[] split_k = scanner.nextLine().trim().split(" ");

        String[] split = scanner.nextLine().trim().split(" ");
        int x = Integer.parseInt(split[0]);
        int N = split_n.length;
        int M = split_m.length;
        int K = split_k.length;
        int[] feng_N = new int[N];
        for (int i = 0; i < N; i++) {
            feng_N[i] = Integer.parseInt(split_n[i]);
        }
        int[] feng_M = new int[M];
        for (int i = 0; i < M; i++) {
            feng_M[i] = Integer.parseInt(split_m[i]);
        }
        int[] feng_K = new int[K];
        for (int i = 0; i < K; i++) {
            feng_K[i] = Integer.parseInt(split_k[i]);
        }
        Arrays.sort(feng_N);
        Arrays.sort(feng_M);
        Arrays.sort(feng_K);

        int res = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    sum = feng_N[i] +feng_M[j]+feng_K[k];
                    if (sum <= x){
                        res++;
                        sum = 0;
                    }else {
                        sum = 0;

                    }

                }
            }
        }
        if (res!=0){
            System.out.println(res);
        }else {
            System.out.println(-1);
        }

    }
}
