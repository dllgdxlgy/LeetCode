package com.lgy.JZoffer;

/**
 * 数字序列中某一位的数字 44
 *
 * @author LGY
 * @create 2022-01-21 13:31
 */
public class A_digit_in_a_sequence_of_numbers_44 {

    public int findNthDigit(int n) {
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) { // 1.
            n -= count;
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit; // 2.
        return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
    }

}
