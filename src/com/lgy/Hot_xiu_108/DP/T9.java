package com.lgy.Hot_xiu_108.DP;

/**
 * T9. 不相邻最大子序列和
 https://www.nowcoder.com/practice/269b4dbd74e540aabd3aa9438208ed8d?tpId=1
 88&&tqId=38344&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-19 21:58
 */
public class T9 {

    /**
     *
     * @param n
     * @param array
     * @return
     */
    public long subsequence (int n, int[] array) {
        // write code here
        long[] dp = new long[n+1];

        dp[0] = 0;
        dp[1] = Math.max(array[0],0);
        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+array[i-1]);
        }
        return dp[n];
    }
}
