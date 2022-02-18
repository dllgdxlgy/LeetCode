package com.lgy.Hot_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * T17、电话号码的字母组合
 *
 * @author LGY
 * @create 2022-02-18 10:03
 */
public class T17 {
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();
        if (digits == "") {
            return res;
        }
        String[] strings = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (digits.length() == 1) {
            int num = Integer.parseInt(digits);
            for (char c : strings[num - 2].toCharArray()) {
                res.add(String.valueOf(c));
            }
            return res;
        }
        if (digits.length() == 2) {
            int num = Integer.parseInt(digits);
            int a = num / 10;
            int b = num % 10;
            char[] chars1 = strings[a - 2].toCharArray();
            char[] chars2 = strings[b - 2].toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                for (int j = 0; j < chars2.length; j++) {
                    res.add(String.valueOf(chars1[i]).concat(String.valueOf(chars2[j])));
                }

            }
            return res;
        }
        if (digits.length() == 3) {
            int num = Integer.parseInt(digits);
            int a = num / 100;
            int b = (num % 100) / 10;
            int c = (num % 100) % 10;
            char[] chars1 = strings[a - 2].toCharArray();
            char[] chars2 = strings[b - 2].toCharArray();
            char[] chars3 = strings[c - 2].toCharArray();
            for (int i = 0; i < chars1.length; i++) {
                for (int j = 0; j < chars2.length; j++) {
                    for (int k = 0; k < chars3.length; k++) {
                        res.add(String.valueOf(chars1[i]).concat(String.valueOf(chars2[j])).concat(String.valueOf(chars3[k])));
                    }

                }

            }
            return res;
        }
        if (digits.length() == 4) {
            int num = Integer.parseInt(digits);
            int a = num / 1000;
            int b = (num % 1000) / 100;
            int c = (num % 1000) % 100 % 10;
            int d = num % 10;
            char[] chars1 = strings[a - 2].toCharArray();
            char[] chars2 = strings[b - 2].toCharArray();
            char[] chars3 = strings[c - 2].toCharArray();
            char[] chars4 = strings[d - 2].toCharArray();

            for (int i = 0; i < chars1.length; i++) {
                for (int j = 0; j < chars2.length; j++) {
                    for (int k = 0; k < chars3.length; k++) {
                        for (int l = 0; l < chars4.length; l++) {
                            res.add(String.valueOf(chars1[i]).concat(String.valueOf(chars2[j])).concat(String.valueOf(chars3[k])).concat(String.valueOf(chars4[l])));
                        }

                    }

                }

            }
            return res;
        }


        return res;
    }

    public static void main(String[] args) {
        int num = 2345;
        int a = num / 1000;
        int b = (num % 1000) / 100;
        int c = (num % 1000) % 100 / 10;
        int d = num % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
