package com.lgy.leetcode;

/**
 * T31 下一个排列
 * @author LGY
 * @create 2022-08-25 22:10
 */
public class T31 {

    /**
     * @param nums
     */
    public void nextPermutation(int[] nums) {

        int temp = nums.length - 2;
        while(temp>=0 && nums[temp]>=nums[temp+1]){
            temp--;
        }

        if(temp >= 0){
            int j = nums.length-1;
            while(j>=0 && nums[temp]>=nums[j]){
                j--;
            }
            swap(nums,temp,j);
        }
        reverse(nums,temp+1);
    }

    public void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public void reverse(int[] arr, int index){
        int left = index;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
