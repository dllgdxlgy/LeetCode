package com.lgy.JZoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字
 *
 * @author LGY
 * @create 2022-01-08 19:18
 */
public class Numbers_that_appear_more_than_half_the_times_in_the_array_39 {

    /**
     * 方法一
     *
     * @param nums
     * @return
     */
    public int majorityElement_1(int[] nums) {


        quickSort(nums,0,nums.length-1);

        return nums[(nums.length)/2];
    }


    /**
     * 快速排序
     *
     * @param arr        传进去的数组
     * @param leftIndex  左指针
     * @param rightIndex 右指针
     * @return 排序好的数组
     */
    public void quickSort(int[] arr, int leftIndex, int rightIndex) {

        if (leftIndex >= rightIndex) {
            return ;
        }
        int left = leftIndex;
        int right = rightIndex;

        int key = arr[left];

        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        quickSort(arr, leftIndex, left- 1);
        quickSort(arr, right + 1, rightIndex);

    }

    public static void main(String[] args) {
        Numbers_that_appear_more_than_half_the_times_in_the_array_39 n = new Numbers_that_appear_more_than_half_the_times_in_the_array_39();

        /**
         * 测试快速排序的方法
         */
//
//        int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};
//
//        n.quickSort(arr, 0, arr.length - 1);
//
//        for (int i : arr) {
//            System.out.print(i + "\t");
//        }

        /**
         * 测试HashMap
         */
        int[] arr = {5, 1, 1, 3, 1, 2, 1, 1};
        int res = n.majorityElement(arr);
        System.out.println(res);


    }

    /**
     * 方法二 HashMap
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {

        int res=0;
        // 创建一个HashMap
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int num:nums) {
            if (map.get(num) > nums.length/2){
                res = num;
            }
        }
        return res;
    }

}
