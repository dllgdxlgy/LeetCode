package com.lgy.Hot_xiu_108.Array;

import java.util.Arrays;

/**
 * 11. 缺失的数字在牛客上没有找到，在leetcode找到的丢失的数字 T268
 * @author LGY
 * @create 2022-06-09 11:34
 */
public class T11 {

    /**
     * 太繁琐了
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    // 思想：https://blog.csdn.net/memory_cood/article/details/88099192

    /**
     * 异或运算
     * @param nums
     * @return
     */
    public int missingNumber_2(int[] nums) {
        int ros = 0;
        for(int i = 0; i < nums.length; i++){
            ros = ros^nums[i];
        }
        for(int i = 0; i <= nums.length;i++){
            ros = ros^i;
        }
        return ros;
    }
}
