package com.lgy.JZoffer;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-05-26 12:59
 */
public class T61 {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int num_0 = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                num_0++;
            } else if ( nums[i] == nums[i - 1] && nums[i] != 0 ) {
                return false;
            }else if (nums[4] - nums[num_0] >= 5){
                return false;
            }
        }
        return true;
    }
}
