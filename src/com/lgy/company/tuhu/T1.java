package com.lgy.company.tuhu;

import java.util.Scanner;

/**
 * @author LGY
 * @create 2022-09-07 19:23
 */
public class T1 {

    public int timeRequiredToBuyCounpons(int[] coupons, int m) {

        int len = coupons.length;
        int res = 0;
        int temp = coupons[m];

        for (int i = 0; i < len; i++) {
            if (i <= m) {
                res += Math.min(temp, coupons[i]) * 10;
                continue;
            }
            if (coupons[i] >= temp) {
                res += 10 * (temp - 1);
            } else {
                res+=coupons[i]*10;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,6,5,6,3,2};
        T1 t1 = new T1();
        int i = t1.timeRequiredToBuyCounpons(arr, 3);
        System.out.println(i);
    }
}
