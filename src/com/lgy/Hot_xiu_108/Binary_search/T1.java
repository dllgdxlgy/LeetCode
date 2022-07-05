package com.lgy.Hot_xiu_108.Binary_search;

import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-07-015
 */
public class T1 {


    /**
     * 只是返回最长的数量，并不返回最长的序列
     *
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,5,3,6,4,8,9,7};
        T1 t1 = new T1();
        int[] i = t1.LIS(arr);
    }

    public int[] LIS(int[] arr) {
        // write code here
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);

        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        int[] res = new int[max];
        Arrays.fill(res, Integer.MAX_VALUE);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < dp.length; j++) {

                if(dp[j] >(i+1) ){
                    break;
                }
                if (dp[j] == (i + 1)) {

                    res[i] = Math.min(res[i], arr[j]);
                }
            }

        }
        return res;

    }
}
