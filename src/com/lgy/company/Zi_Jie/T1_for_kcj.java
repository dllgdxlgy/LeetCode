package com.lgy.company.Zi_Jie;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-05-06 10:17
 */
public class T1_for_kcj {

    public static void main(String[] args) {

        // 定义输入
        Scanner scanner = new Scanner(System.in);
        // 接受下一个参数
        int n = scanner.nextInt();
        // 创建两个数组，存放Buff开始时间
        int[] timeSeries = new int[n];
        // 持续时间
        int[] durations = new int[n];

        for (int i = 0; i < n; i++) {
            timeSeries[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            durations[i] = scanner.nextInt();
        }
        int[][] arrs = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrs[i][0] = timeSeries[i];
            arrs[i][1] = durations[i] + timeSeries[i] -1;
        }

        LinkedList<int[]> res = new LinkedList<>();

        res.add(arrs[0]);


        for (int i = 1; i < n; i++) {
            int[] temp = arrs[i];
            int[] last = res.getLast();
            if (last[1] >= temp[0]){
                last[1] = Math.max(last[1],temp[1]);


            }else {
                res.add(temp);
            }
        }
        int[][] ints = res.toArray(new int[0][0]);

        int sum = 0;

        for (int i = 0; i < ints.length;i++) {
            sum += ( ints[i][1] - ints[i][0] + 1);
        }
        System.out.println(sum);


    }
}
