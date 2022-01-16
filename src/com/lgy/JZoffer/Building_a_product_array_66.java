package com.lgy.JZoffer;

/**
 * 构建乘积数组
 *
 * @author LGY
 * @create 2022-01-16 22:39
 */
public class Building_a_product_array_66 {

    /**
     * 此方法用到了除法，不符合题意。
     * @param a
     * @return
     */
    public int[] constructArr(int[] a) {
        int i = 0;
        int length = a.length;
        int p = 1;
        int[] arr = new int[length];

        while (i < length) {
            p *= a[i];
            ++i;
        }

        for (int j = 0; j < length; j++) {
            arr[j] = p / a[j];
        }

        return arr;
    }

}
