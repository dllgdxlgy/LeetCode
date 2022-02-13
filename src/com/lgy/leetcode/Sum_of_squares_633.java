package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-02-13 23:22
 */
public class Sum_of_squares_633 {
    public boolean judgeSquareSum(int c) {

        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long cur = a * a + b * b;
            if (cur == c) {
                return true;
            } else if (cur > c){
                b--;
            }else {
                a++;
            }

        }
        return false;
    }

}
