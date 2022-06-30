package com.lgy.JZoffer;

/**
 * T59

 https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 * @author LGY
 * @create 2022-06-30 19:03
 */
public class T59 {

    public int[] maxSlidingWindow(int[] nums, int k) {


        if(nums == null || nums.length == 0){
            return nums;
        }
        int[] arr = new int[nums.length-k+1];

        for(int i = k-1;i < nums.length;i++){
            arr[i-k+1]= maxint(nums,i-k+1,i);
        }
        return arr;
    }
    public int maxint(int[] arr,int start,int end){
        int max = arr[start];
        for(int i = start+1; i <= end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
