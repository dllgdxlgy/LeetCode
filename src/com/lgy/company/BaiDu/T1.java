package com.lgy.company.BaiDu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-10-11 19:41
 */
public class T1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        scanner.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = arr[i][0]; j < arr[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);

            }
        }
        int k = Integer.MIN_VALUE;
        int v = Integer.MIN_VALUE;

        for(int key : map.keySet()){
            if(map.get(key) > v){
                k = key;
                v = map.get(key);
            }
        }
        System.out.println(k+" "+v);
    }
}
