package com.lgy.leetcode;

import com.lgy.Hot_100.T5;
import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

public class T53 {
    public int maxSubArray(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.max(nums[i]+dp[i-1],nums[i]);

        }
        Arrays.sort(dp);
        return dp[nums.length-1];

    }

    public int maxSubArray_1(int[] nums) {

        int res = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

            temp = Integer.max(temp+nums[i],nums[i]);
            res = Integer.max(res,temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        T53 t53 = new T53();
        int i = t53.maxSubArray_1(arr);
    }
}
