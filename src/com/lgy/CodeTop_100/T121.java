package com.lgy.CodeTop_100;

/**
 * 股票买卖最佳时机
 * @author LGY
 * @create 2022-07-15 16:15
 */
public class T121 {

    public int maxProfit(int[] prices) {
        if(prices.length <2){
            return 0;
        }
        int min_price = prices[0];
        int max = 0;
        for(int i = 0;i < prices.length;i++){
            min_price = Math.min(min_price,prices[i]);
            max = Math.max(max,prices[i]-min_price);
        }
        return max;
    }
}
