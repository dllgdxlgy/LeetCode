package com.lgy.Hot_xiu_108.Array;

/**
 * 6. 买卖股票的最好时机(一)
 https://www.nowcoder.com//practice/64b
 4262d4e6d4f6181cd45446a5821ec?tpId=190&
 &tqId=35181&rp=1&ru=/activity/oj&qru=/ta/job-code-high-rd/question-ranking
 * @author LGY
 * @create 2022-06-07 14:41
 */
public class T6 {


    /**
     * 思想：就是求出每一天可能的最小值，然后用当天的值减去最小值，就是可能获得的利润，再去最大值。
     *
     * 注意：这里不能创建数组，这样不通过。
     *
     * @param prices
     * @return
     */
    public int maxProfit (int[] prices) {
        // write code here
        int len = prices.length; //获取长度
        //特殊条件判断
        if(len < 2){
            return 0;
        }
        //获取长度
        int low_price = prices[0];
        int res = 0;
        for(int i =0; i < len; i++){
            low_price = Math.min(low_price,prices[i]);
            res = Math.max(res, prices[i]-low_price);
        }
        return res;
    }
}
