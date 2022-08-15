package com.lgy.leetcode;


/**
 * T376 摆动序列
 * @author LGY
 * @create 2022-08-14 11:32
 */
public class T376 {

    public int wiggleMaxLength(int[] nums) {


        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for(int i = 1;i < len; i++){
            dp[i][0] = dp[i][1] = 1;

            for(int j = 0; j < i; j++){
                if(nums[j] > nums[i]){
                    dp[i][1] = Math.max(dp[i][1],dp[j][0]+1);
                }
                if(nums[j] < nums[i]){
                    dp[i][0] = Math.max(dp[i][0],dp[j][1]+1);
                }
            }
        }
        return Math.max(dp[len-1][0],dp[len-1][1]);
    }
}
