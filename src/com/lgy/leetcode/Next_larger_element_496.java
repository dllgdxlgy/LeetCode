package com.lgy.leetcode;

import java.util.Arrays;

/**
 * 下一个最大的元素
 */

public class Next_larger_element_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//        int[] arr= new int[1000];
//        //数组进行排序
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        //两个指针
//        int n1=0,n2=0;
//        for (n1=0; n1<nums1.length;n1++) {
//            while (nums1[n1]>nums2[n2]){
//                ++n2;
//            }
//            arr[n1]=nums2[n2];
//        }
//
//        return arr;
        int[] arr = new int[nums1.length];
        int n1,n2=0;
        for (n1 =0; n1<nums1.length;n1++){
            while (nums1[n1]!=nums2[n2]){
                ++n2;
            }
            int i;
            for (i=n2+1; i<nums2.length;i++){
                if (nums2[i]>nums1[n1]){
                    arr[n1]=nums2[i];
                    break;
                }
            }
            if (i==nums2.length){
                arr[n1]=-1;
            }
            n2=0;
        }
        return arr;
    }
}
