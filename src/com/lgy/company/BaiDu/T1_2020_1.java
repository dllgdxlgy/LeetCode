package com.lgy.company.BaiDu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-04-19 10:45
 */
public class T1_2020_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextInt(),scanner.nextInt());
        }
        System.out.println(1);

    }
}
