package com.lgy.Hot_100;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author LGY
 * @create 2022-02-21 23:01
 */
public class T4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length;
        int len2 = nums2.length;

        int[] arr = new int[len + len2];
        int sum = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = nums1[i];
        }
        for (int i = len; i < sum; i++) {
            arr[i] = nums2[i - len];
        }
        Arrays.sort(arr);
        while (sum % 2 == 1) {
            return arr[(sum + 1) / 2];
        }
        return (arr[sum / 2] + arr[sum / 2 - 1]) / 2.0;
    }

    public static void main(String[] args) {
        T4 t4 = new T4();
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        double res = t4.findMedianSortedArrays(num1, num2);
        System.out.println(res);

    }
}
