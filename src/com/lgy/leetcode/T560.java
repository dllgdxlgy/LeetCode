package com.lgy.leetcode;

import com.lgy.company.leetcodecom.T;

public class T560 {
    public int subarraySum(int[] nums, int k) {
        // 获取数组的长度
        int len = nums.length;
        // 创建数组
        int[] arr = new int[len+1];
        arr[0] = 0;
        for (int i = 1; i <= len; i++) {
            arr[i] +=arr[i-1]+nums[i-1];
        }
        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left+1; right < len+1 ; right++) {
                if (arr[right] -arr[left] == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        T560 t560 = new T560();
        int[] arr = new int[]{1,1,1};
        int i = t560.subarraySum(arr, 2);
    }
}
