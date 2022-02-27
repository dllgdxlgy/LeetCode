package com.lgy.JZoffer;

/**
 * 求1+2+…+n
 *
 * @author LGY
 * @create 2022-01-16 23:45
 */
public class Find_1_2_n_64 {
    public int sumNums(int n) {

        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;

    }
}
