package com.lgy.leetcode;

public class T35 {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length;
        int mid = left;
        while (left < right){
             mid = (left+right)/2;
            if (nums[mid] == target){
                return mid;
            }else if ( nums[mid] < target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return mid;
    }

    /**
     * O(n) 时间复杂度
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert_1(int[] nums, int target) {

        if (nums==null){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }
}
