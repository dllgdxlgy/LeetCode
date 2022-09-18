package com.lgy.company.bolekeji;

/**
 * @author LGY
 * @create 2022-09-18 20:00
 */
public class T4 {

    public int maximumSum (int[] arr) {
        int[] dp = new int[arr.length];
        int[] dp1 = new int[arr.length];
        int res = arr[0];
        dp[0] = arr[0];
        dp1[0]  = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            dp1[i] = Math.max(dp[i-1]+arr[i],dp1[i-1]);
            res = Math.max(res,Math.max(dp1[i],dp[i]));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,-1,0,4};
        T4 t4 = new T4();
        int i = t4.maximumSum(arr);
        System.out.println(i);
    }
}
