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
     *
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
        int ran = left + random.nextInt(right - left + 1);
        swap_1(arr, left, ran);

        int temp = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= temp) {
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


    /**
     * 第二遍———— 快速排序
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest_2(int[] nums, int k) {
        int len = nums.length;
        int index = len - k;

        int left = 0;
        int right = nums.length - 1;
        while (true) {
            int temp = partition2(nums, left, right);
            if (temp == index) {
                return nums[temp];
            } else if (temp < index) {
                left = temp + 1;
            } else {
                right = temp - 1;
            }
        }
    }

    public int partition2(int[] arr, int left, int right) {
        int low = left;
        int high = right;


        int temp = arr[low];
        while (low < high) {

            while (low < high && arr[high] >= temp)
                high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= temp)
                low++;
            arr[high] = arr[low];
        }
        arr[high] = temp;
        return low;
    }

    public static void main(String[] args) {
        T215 t215 = new T215();
        int[] arr = new int[]{3,2,1,5,6,4};
        int kthLargest_2 = t215.findKthLargest_2(arr, 2);
    }
}
