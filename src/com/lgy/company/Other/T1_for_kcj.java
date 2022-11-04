package com.lgy.company.Other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class T1_for_kcj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = left+1;
        while (right < n){
            if (arr[left] == arr[right]){
                arr[right]=-1;
                right++;

                map.put(left,map.getOrDefault(left,1)+1);
                continue;
            }
            left = right;
            right = right+1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1){
                System.out.print(arr[i]);
                if (map.containsKey(i)){
                    System.out.print("("+ map.get(i)+")");

                }
                System.out.print(" ");
            }

        }
    }


}
