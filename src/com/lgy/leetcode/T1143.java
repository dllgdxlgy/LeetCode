package com.lgy.leetcode;

/**
 * T1143. 最长公共子序列
 *
 *
 * @author LGY
 * @create 2022-06-20 14:03
 */
public class T1143 {


    /**
     *
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence (String text1, String text2) {
        // write code here
        int len_s1 = text1.length();
        int len_s2 = text2.length();

        if(len_s1 == 0 || len_s2 == 0){
            return 0;
        }

        int[][] dp = new int[len_s1+1][len_s2+1];

        for(int i = 1;i <= len_s1;i++){
            for(int j = 1; j <= len_s2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[len_s1][len_s2];
    }
}
