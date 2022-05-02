package com.lgy.leetcode;

/**
 * 高楼扔鸡蛋
 * @author LGY
 * @create 2022-05-02 14:48
 */
class T887 {
    public int superEggDrop(int K, int N) {
        // m 最多不会超过 N 次（线性扫描）
        int[][] dp = new int[K + 1][N + 1];
        // base case:
        // dp[0][..] = 0
        // dp[..][0] = 0
        // Java 默认初始化数组都为 0
        int m = 0;
        while (dp[K][m] < N) {
            m++;
            for (int k = 1; k <= K; k++)
                dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
        }
        return m;
    }
}
// 详细解析参见：
// https://labuladong.github.io/article/?qno=887

