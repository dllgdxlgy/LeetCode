package com.lgy.Hot_xiu_108.Binary_search;

import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-07-015
 */
public class T1 {


    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        int max = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j >= 0; j--){
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);

                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,0,3,2,3};
        T1 t1 = new T1();
        int i = t1.lengthOfLIS(arr);
    }
}
