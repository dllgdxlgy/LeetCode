package com.lgy.JZoffer;

/**
 * 剑指 Offer 21 题
 */
public class Adjust_the_array_order_so_that_odd_numbers_precede_even_numbers_21 {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0 ||nums.length == 1){
            return nums;
        }
        int i=0;
        int j = nums.length-1;
        int k =0;
        while (i < j){
            if (nums[i]%2 ==1){
                i++;
            }else if(nums[i]%2 == 0 && nums[j]%2 == 1 ){
                k = nums[i];
                nums[i] = nums[j];
                nums[j] = k;
            }else {
                j--;
            }
        }
        return nums;
    }

}
