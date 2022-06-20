package com.lgy.Hot_xiu_108.DP;

/**
 * T12. 编辑距离

 https://www.nowcoder.com/practice/05fed41805ae4394ab6607d0d745c8e4?tpI
 d=188&&tqId=38327&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-20 09:54
 */
public class T12 {

    /**
     * 最小编辑距离（一）
     *
     来自LeetCode

     https://leetcode.cn/problems/edit-distance/
     * @param word1
     * @param word2
     * @return
     */
    public int minDistance(String word1, String word2) {
        int len_word1 = word1.length();
        int len_word2 = word2.length();

        int[][] dp = new int[len_word1+1][len_word2+1];

        for (int i = 1; i <= len_word1 ; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= len_word2; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i <=len_word1; i++) {
            for (int j = 1; j <= len_word2; j++) {
                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    int replace = dp[i-1][j-1] +1;
                    int delete = dp[i][j-1] + 1;
                    int insert = dp[i-1][j] + 1;
                    dp[i][j] = Math.min(replace,Math.min(delete,insert));
                }
            }
        }

        return dp[len_word1][len_word2];
    }
}
