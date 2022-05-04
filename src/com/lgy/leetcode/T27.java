package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-05-04 20:51
 */
public class T27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (length == 0){
            return 0;
        }
        int res = 0;
        int right = 0;

        while (right < length){
            if (nums[right] == val){
            }else {
                nums[res] = nums[right];
                res++;
            }
            right++;
        }
        return res;
    }
}
