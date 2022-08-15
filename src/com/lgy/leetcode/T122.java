package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-15 09:01
 */
public class T122 {


    /**
     * T122 买卖股票的最佳实际 II
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int res = 0;

        for(int i = 1; i<prices.length;i++){
            int temp = prices[i] - prices[i-1];
            if(temp > 0){
                res+=temp;
            }
        }
        return res;
    }
}
