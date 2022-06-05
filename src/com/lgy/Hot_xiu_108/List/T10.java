package com.lgy.Hot_xiu_108.List;

/**
 * @author LGY
 * @create 2022-06-05 21:14
 */
public class T10 {

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
