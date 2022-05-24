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
            if (nums[i] == target) {
                res++;
            }
        }
        return res;
    }

    public int search_1(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;

        while (left <= right){

            int mid = (left + right)/2;

            if (nums[mid] > target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else {
                if (nums[right] != target){
                    right--;
                }else if (nums[left]!=target){
                    left++;
                }else {
                    break;
                }

            }

        }
        return right-left+1;
    }
}
