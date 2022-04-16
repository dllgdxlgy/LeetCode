package com.lgy.company.pinduoduo;

import java.util.*;

/**
 * @author LGY
 * @create 2022-04-10 19:16
 */
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i-j > 0 && arr[i] == arr[j] &&!set.contains(arr[i])){
                    res = j-i;
                }

                while (j+res < n && arr[j+res] == arr[j]){
                    j = j+res;
                }
                if (j>=n){
                    map.put(arr[i],res);
                }
            }

        }
        for (Integer i:map.keySet()) {
            System.out.println(i+" "+map.get(i));

        }



    }
}
