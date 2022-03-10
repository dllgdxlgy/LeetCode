package com.lgy.JZoffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *  12 整数转罗马数字
 */
public class Integer_to_Roman_numeral_12 {
    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <values.length; i++) {
            while (num>=values[i]){
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer_to_Roman_numeral_12 itrn = new Integer_to_Roman_numeral_12();
        System.out.println(itrn.intToRoman(4));
    }
}
