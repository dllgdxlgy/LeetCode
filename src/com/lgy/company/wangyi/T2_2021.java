package com.lgy.company.wangyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-16 11:02
 */
public class T2_2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <2*N ; i++) {
            int num = scanner.nextInt();
            List<Integer> list = new ArrayList<>(num);
            List<Integer> list1 = new ArrayList<>(num-1);
            for (int j = 0; j < num; j++) {
                list.add(scanner.nextInt());
            }
            for (int j = 0; j < num - 1; j++) {
                list1.add(scanner.nextInt());
            }
            lists.add(list);
            lists.add(list1);
        }

        for (int i = 0; i < N; i++) {

        }
    }
}
