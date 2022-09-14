package com.lgy.CodeTop_100;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-09-12 16:55
 */
public class T300 {


    /**
     * 300. 最长递增子序列
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = dp[0];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);

                }
            }
            res = Math.max(res,dp[i]);
        }


        return res;
    }
}
