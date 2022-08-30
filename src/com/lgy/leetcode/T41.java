package com.lgy.leetcode;

/**
 * T41 缺失的第一个正数
 * @author LGY
 * @create 2022-08-30 16:41
 */
public class T41 {

    public int firstMissingPositive (int[] nums) {
        // write code here
        //获取数组的长度
        int len = nums.length;

        for(int i = 0; i < len; i++ ){
            while(nums[i] >= 1 && nums[i] <= len && nums[nums[i]-1] != nums[i] ){
                swap(nums,i,nums[i]-1);
            }
        }

        for(int i = 0; i< len;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return len+1;
    }

    public void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }
}
