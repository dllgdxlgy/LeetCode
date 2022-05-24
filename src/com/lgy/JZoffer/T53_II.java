package com.lgy.JZoffer;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-05-24 17:53
 */
public class T53_II {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}
