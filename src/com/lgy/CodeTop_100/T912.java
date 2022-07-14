package com.lgy.CodeTop_100;

/**
 * @author LGY
 * @create 2022-07-14 18:26
 */
public class T912 {


    /**
     * 手撕快速排序
     * @param nums
     * @return
     */
    public int[] sortArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        quick_sort(nums,left,right);
        return nums;
    }
    public void quick_sort(int[] arr ,int low,int high){
        int left = low;
        int right = high;

        if(left>=right){
            return;
        }
        int temp = arr[left];
        while(left < right){
            while(left < right && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];
            while(left  < right && arr[left] <=temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        quick_sort(arr,low,left-1);
        quick_sort(arr,left+1,high);

    }
}
