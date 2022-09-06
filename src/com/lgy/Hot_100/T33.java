package com.lgy.Hot_100;

public class T33 {


    /**
     * 第一次 搜索旋转排序数组
     * @param nums
     * @param target
     * @return
     */
    public int search_1(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        while(left <= right){
            int temp = left+(right-left)/2;
            if(nums[temp] == target){
                return temp;
            }
            if(nums[temp] >= nums[left]){
                if(nums[left] <= target && nums[temp] >target ){
                    right = temp-1;
                }else{
                    left = temp+1;
                }
            }else{
                if( target<=nums[right] && nums[temp]<target){
                    left = temp+1;
                }else{
                    right = temp-1;
                }
            }
        }
        return -1;
    }
    /**
     * 写的时候不能用这种方法
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
