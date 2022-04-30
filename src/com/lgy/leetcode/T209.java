package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

import java.util.Arrays;

public class T209 {
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
