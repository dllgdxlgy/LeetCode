package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-08 10:54
 */
public class T70 {

    public int climbStairs(int n) {

        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
