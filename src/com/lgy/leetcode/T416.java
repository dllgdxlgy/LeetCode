package com.lgy.leetcode;

/**
 * T416 分割等和子集
 * @author LGY
 * @create 2022-08-19 17:59
 */
public class T416 {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        if(sum%2 == 1){
            return false;
        }
        int weight = sum/2;
        int kind = nums.length;
        boolean[][] dp = new boolean[kind+1][weight+1];
        for (int i = 0; i <= kind; i++)
            dp[i][0] = true;

        for(int i = 1; i <= kind; i++){
            for(int j = 1;j <= weight; j++){
                if(j<nums[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[kind][weight];


    }
}
