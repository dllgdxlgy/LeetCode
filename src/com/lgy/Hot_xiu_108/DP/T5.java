package com.lgy.Hot_xiu_108.DP;

/**
 * 5. 01 背包
 https://www.nowcoder.com/practice/2820ea076d144b30806e72de5e5d4bbf?tpId=188&&tqId=38312&rp=1&ru=/activ
 ity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-18 15:30
 */
public class T5 {

    /**
     * 动态规划
     *
     * @param V
     * @param n
     * @param vw
     * @return
     */

    public int knapsack (int V, int n, int[][] vw) {
        // write code here
        if(V == 0 || n == 0 || vw == null){
            return 0;
        }
        int[][] dp = new int[n+1][V+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=V; j++){
                if(j < vw[i-1][0]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-vw[i-1][0]]+vw[i-1][1]);
                }
            }
        }
        return dp[n][V];
    }
}
