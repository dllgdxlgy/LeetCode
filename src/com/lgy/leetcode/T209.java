package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

public class T209 {

    /**
     * 二刷、滑动窗口
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen_1(int target, int[] nums) {

        int res = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;

        int length = nums.length;
        int sum = 0;
        while(right < length){
            int temp = nums[right];
            sum += temp;
            right++;

            while( sum >= target){

                res = Math.min(res,right-left);
                int temp_left = nums[left];
                sum-=temp_left;
                left++;
            }

        }
        return res==Integer.MAX_VALUE?0:res;
    }
    public int minSubArrayLen(int target, int[] nums) {

        int arr_min = Integer.MAX_VALUE;
        for (int left = 0; left < nums.length; left++){
            int sum = 0;
            for (int right = left; right < nums.length;right++){

                sum += nums[right];

                if (sum < target){
                    continue;
                }
                if (sum >= target){
                    arr_min = Integer.min(arr_min,right - left + 1);
                    break;
                }

            }
        }


        return arr_min==Integer.MAX_VALUE ? 0:arr_min;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        T209 t209 = new T209();
        int i = t209.minSubArrayLen(7,arr );
        System.out.println(i);
    }
}
