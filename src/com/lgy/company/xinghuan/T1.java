package com.lgy.company.xinghuan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-03 17:05
 */
public class T1 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            int index = i+1;
            int num = 0;
            for (; index < n; index++) {
                num++;
                if (arr[i][0] < arr[index][0] && arr[i][1] > arr[index][1] || arr[i][0] > arr[index][0] && arr[i][1] < arr[index][1]) {
                    break;
                }
            }
            if(index == n && num!=0){
                set.add(i);
            }

        }
        System.out.println(set.size());
    }
}
