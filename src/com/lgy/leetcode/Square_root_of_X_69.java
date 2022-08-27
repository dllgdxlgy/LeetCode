package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-02-15 23:02
 */
public class Square_root_of_X_69 {

    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        int l = 1, r = x;
        int mid, sqrt;
        while (l <= r) {
            mid = l + (r - l) / 2;
            sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            } else if (mid > sqrt) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Square_root_of_X_69 t = new Square_root_of_X_69();
        int i = t.mySqrt(8);
        System.out.println(i);
    }

}
