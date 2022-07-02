package com.lgy.Hot_xiu_108.Binary_search;

/**
 * T6. 缺失数字
 https://leetcode.cn/problems/missing-number/submissions/
 * @author LGY
 * @create 2022-07-02 17:31
 */
public class T6 {

    /**
     * 异或运算
     * @param nums
     * @return
     */
    public int missingNumber_2(int[] nums) {
        int ros = 0;
        for(int i = 0; i < nums.length; i++){
            ros = ros^nums[i];
        }
        for(int i = 0; i <= nums.length;i++){
            ros = ros^i;
        }
        return ros;
    }
}
