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
     *
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

    /**
     *
     * @param a
     * @return
     */
    public int[] constructArr_1(int[] a) {

        if (a.length == 0){
            return new int[0];
        }
        int length = a.length;
        //创建数组
        int[] arr = new int[length];
        int tmp = 1;
        arr[0] = 1;

        for (int i = 1; i < length; i++) {
            arr[i] = a[i - 1] * arr[i - 1];
        }
        for (int j = length - 2; j >= 0; j--) {
            tmp *= a[j+1];
            arr[j] *= tmp;
        }
        return arr;

    }


}
