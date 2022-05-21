package com.lgy.company.Mei_Tuan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * // 未写完
 * @author LGY
 * @create 2022-05-20 15:46
 */
public class T1_2022_Chun_XZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        // 特殊情况判断
        if (2 * x > n || 2 * y < n) {
            System.out.println(-1);
            return;
        }

    }
}
