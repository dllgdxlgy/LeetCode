package com.lgy.CodeTop_100;

/**
 * 股票买卖最佳时机
 *
 * @author LGY
 * @create 2022-07-15 16:15
 */
public class T121 {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min_price = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min_price = Math.min(min_price, prices[i]);
            max = Math.max(max, prices[i] - min_price);
        }
        return max;
    }

    public static void main(String[] args) {
        T121 t121 = new T121();
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};
        int i = t121.maxProfit(arr);
    }

    /**
     * 第二遍
     *
     * @param prices
     * @return
     */
    public int maxProfit_2(int[] prices) {
        int res = 0;
        int len = prices.length;

        int[] dp = new int[len];
        dp[0] = prices[0];

        for (int i = 1; i < len; i++) {
            dp[i] = Math.min(dp[i - 1], prices[i]);
            res = Math.max(res, prices[i] - dp[i]);
        }
        return res;
    }
}
