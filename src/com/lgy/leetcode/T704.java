package com.lgy.leetcode;

/**
 * 二分查找
 *
 * @author LGY
 * @create 2022-03-31 19:47
 */
public class T704 {
    public int search(int[] nums, int target) {

        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return res;
            }
        }
        return res;

    }

    /**
     * 二分查找
     */
    public int search_1(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int midle = left + (right - left) / 2;
            if (nums[midle] == target) {
                return midle;
            } else if (nums[midle] < target) {
                left = midle + 1;
            } else if (nums[midle] > target) {
                right = midle - 1;
            }

        }
        return -1;
    }


    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public int search_2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int temp = left + (right - left)/2;
            if(nums[temp] == target){
                return temp;
            }else if(nums[temp] > target){
                right = temp-1;
            }else{
                left = temp+1;
            }
        }
        return -1;
    }


}
