package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-02 15:13
 */
public class T516 {

    public int longestPalindromeSubseq(String s) {
        int length = s.length();

        int[][] dp = new int[length][length];


        //数组初始化
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
        }

        for (int i = length-1; i >=0; i--) {
            for (int j = i+1 ; j < length; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else {
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp[0][length-1];
    }


}
