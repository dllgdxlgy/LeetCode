package com.lgy.JZoffer;

/**
 * 连续子数组的最大和
 *
 * @author LGY
 * @create 2022-01-07 19:10
 */
public class Maximum_sum_of_consecutive_subarrays_42 {

    public int maxSubArray(int[] nums) {
        int res =  nums[0] ;
        if (nums.length ==1){
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0){
                nums[i] += nums[i-1];

            }
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
