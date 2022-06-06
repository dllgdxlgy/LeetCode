package com.lgy.Hot_xiu_108.List;

/**
 *10.
 https://www.nowcoder.com/practice/41c399fdb60
 04b31a6cbb047c641ed8a?tpId=188&&tqId=38296&rp=1&r
 u=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-05 21:14
 */
public class T10 {

    /**
     * 参考 leetcode
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {
        //数组索引是从0开始的
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

}
