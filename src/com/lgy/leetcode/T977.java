package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author LGY
 * @create 2022-10-05 09:59
 */
public class T977 {


    /**
     * 双指针
     * @param nums
     * @return
     */
    public int[] sortedSquares_1(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int index = nums.length-1;
        int[] arr = new int[index+1];

        while(left <= right){
            if(nums[left] * nums[left] <= nums[right] * nums[right]){
                arr[index] = nums[right] * nums[right];
                right--;
            }else{
                arr[index] =nums[left] * nums[left];
                left++;
            }
            index--;
        }

        return arr;
    }
    /**
     * 暴力解
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(nums[i]*nums[i]);
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        return arr;
    }
}
