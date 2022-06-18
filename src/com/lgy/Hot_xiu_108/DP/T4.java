package com.lgy.Hot_xiu_108.DP;

/**
 * 4. 买卖股票的最好时机(一)

 https://www.nowcoder.com/practice/64b4262d4e6d4f6181cd45446a5821ec?tpId=188&&t
 qId=38313&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-18 15:20
 */
public class T4 {

    /**
     * 自己做的
     * @param prices
     * @return
     */
    public int maxProfit (int[] prices) {
        // write code here
        int min_price = prices[0];
        int res = 0;
        for(int i = 1;i < prices.length; i++){
            min_price =  Math.min(min_price,prices[i]);
            res = Math.max(res,(prices[i]-min_price));
        }
        return res;
    }
}
