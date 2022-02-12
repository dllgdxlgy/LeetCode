package com.lgy.leetcode;

import java.util.Arrays;

/**
 * 合并两个有序数组
 *
 * @author LGY
 * @create 2022-02-12 21:19
 */
public class Merge_two_ordered_arrays_88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int middle = m - 1;
        int num_1 = m + n - 1;
        int num_2 = n - 1;
        while (num_2 != 0) {
            if (nums1[middle] >= nums2[num_2]) {
                nums1[num_1] = nums1[middle];
                middle--;
                num_1--;

            } else {
                nums1[num_1] = nums2[num_2];
                middle--;
                num_2--;
            }
        }

    }

    public void merge_1(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            ++m;
        }
        Arrays.sort(nums1);
    }

}
