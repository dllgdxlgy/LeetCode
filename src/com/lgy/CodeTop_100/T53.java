package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-14 18:25
 */
public class T53 {

    /**
     * 最大子序列和
     *
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0;i < nums.length;i++){
            temp = Math.max(nums[i],(nums[i]+temp));
            res = Math.max(res,temp);
        }
        return res;
    }
}
