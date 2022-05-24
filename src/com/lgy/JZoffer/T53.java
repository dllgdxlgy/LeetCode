package com.lgy.JZoffer;

import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-05-24 17:25
 */
public class T53 {

    public int search(int[] nums, int target) {

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                res++;
            }
        }
        return res;
    }
}
