package com.lgy.company.yinyue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-27 19:47
 */
public class T2_for_kcj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            set.add(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        scanner.close();

        int num = 0;
        for (Integer i : map.keySet()) {

            if (map.get(i) == 1) {
                continue;
            } else {
                int temp = i;
                int temp_num = 0;
                while (set.contains(temp - k) && set.contains(temp + k)) {
                    temp -= k;
                    temp_num++;
                }
                set.add((temp_num+1) * k + i);
                map.put(i,map.getOrDefault(i,0)-1);
                num += temp_num == 0 ? 1 : temp_num;
            }
        }
        System.out.println(num);

    }
}
