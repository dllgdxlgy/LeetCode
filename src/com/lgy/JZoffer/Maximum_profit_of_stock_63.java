package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2022-01-15 22:33
 */
public class Maximum_profit_of_stock_63 {

    public int maxProfit(int[] prices) {
        int length = prices.length;

        int res = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((prices[j] - prices[i]) > res) {
                    res = prices[j] - prices[i];
                }
            }


        }
        return res;
    }

    public int maxProfit_1(int[] prices) {


        return 0;
    }

    public static void main(String[] args) {
        Maximum_profit_of_stock_63 m = new Maximum_profit_of_stock_63();
        int[] array = new int[]{7, 1, 5, 3, 6, 4};
        int res = m.maxProfit(array);
        System.out.println(res);
    }
}
