package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2022-01-19 22:06
 */
public class The_number_of_occurrences_of_numbers_in_the_array_56_I {

    public int[] singleNumbers(int[] nums) {

        int z = 0;
        for (int i : nums) {
            z ^= i;
        }
        int m = 1;
        while ((z & m) == 0) {
            m <<= 1;
        }
        int x = 0, y = 0;
        for (int i : nums) {
            if ((m & i) == 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }
        return new int[]{x, y};
    }
}
