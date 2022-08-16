package com.lgy.leetcode;

/**
 * T746 使用最小花费爬楼梯
 * @author LGY
 * @create 2022-08-16 11:22
 */
public class T746 {

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        if(cost.length ==2){
            return Math.min(cost[0],cost[1]);
        }
        int len = cost.length+1;
        int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2;i < len; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[len-1];
    }
}
