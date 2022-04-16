package com.lgy.leetcode;

public class T96 {
    public int numTrees(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
//        for (int i = 2; i < n+1; i++) {
//            for (int j = 1; j <= i ; j++) {
//                arr[i] += arr[j-1] * arr[i-j];
//            }
//        }
        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j] * arr[i-j-1];
            }
        }

        return arr[n];
    }
}
