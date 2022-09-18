package com.lgy.company.bolekeji;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-09-18 19:35
 */
public class T2 {

    public int minNumberDisappeared(int[] nums) {
        // write code here

        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res = i+1;
                break;
            }
        }
        return res ;
    }
}
