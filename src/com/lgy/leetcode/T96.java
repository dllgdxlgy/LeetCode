package com.lgy.leetcode;

/**
 *  T96. 不同的二叉搜索树
 */
public class T96 {

    /**
     * 二刷
     * @param n
     * @return
     */
    public int numTrees(int n) {

        int[] dp = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2;i < n+1;i++){
            for(int j = 1; j<=i;j++){
                dp[i]+=dp[i-j]*dp[j-1];
            }
        }
        return dp[n];
    }


    public int numTrees_1(int n) {
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
