package com.lgy.CodeTop_100;

import java.util.Random;

/**
 * @author LGY
 * @create 2022-07-14 12:51
 */
public class T215 {

    /**
     * 类似与冒泡排序，效果不是很好
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {

        //这个要会手写
        //Integer.MAX_VALUE

        int len = nums.length;

        int m = k;
        while (m > 0) {
            for (int i = 1; i < len; i++) {
                if (nums[i] < nums[i - 1]) {
                    swap(nums, i - 1, i);
                }
            }
            m--;
        }
        return nums[len - k];
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * -------------------------解法二----快速排序-----------------------------
     * @param nums
     * @param k
     * @return
     */
    private final static Random random = new Random(System.currentTimeMillis());

    public int findKthLargest_1(int[] nums, int k) {

        int len = nums.length;
        int target = len - k;

        int left = 0;
        int right = len - 1;

        while (true) {
            int index = partition(nums, left, right);
            if (target == index) {
                return nums[index];
            } else if (index < target) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
    }

    public int partition(int[] arr, int low, int high) {
        int left = low;
        int right = high;
        int ran = left + random.nextInt(right-left+1);
        swap_1(arr,left,ran);

        int temp = arr[left];
        while (left < right){
            while (left < right && arr[right]>=temp){
                right--;
            }
            arr[left] = arr[right];
            while (left<right && arr[left] <=temp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }

    public void swap_1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
