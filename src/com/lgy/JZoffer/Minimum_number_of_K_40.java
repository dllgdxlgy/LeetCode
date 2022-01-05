package com.lgy.JZoffer;

/**
 * 最小的k个数
 *
 * @author LGY
 * @create 2022-01-05 13:40
 */
public class Minimum_number_of_K_40 {

    public int[] getLeastNumbers(int[] arr, int k) {

        int tem;
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }

            }
            res[i] = arr[i];

        }

        return res;
    }
}
