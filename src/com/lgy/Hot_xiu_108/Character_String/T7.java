package com.lgy.Hot_xiu_108.Character_String;

import java.util.HashMap;

/**
 * 7. 将字符串转化为整数
 * <p>
 * https://leetcode.cn/problems/string-to-integer-atoi/
 *
 * @author LGY
 * @create 2022-06-14 22:23
 */
public class T7 {


    /**
     * 推荐的做法，不会，看的答案
     *
     * @param s
     * @return
     */
    public int myAtoi(String s) {

        //先处理前后空格
        String str = s.trim();
        //记录符号，默认为 1；
        int sign = 1;

        //记录结果，默认为 0；
        int res = 0;
        //进行遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && c == '+') {
                sign = 1;
            } else if (i == 0 && c == '-') {
                sign = -1;
            } else if (Character.isDigit(c)) { // 是数字的情况再单独讨论
                int num = c - '0';
                if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                }
                if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && -num < Integer.MIN_VALUE % 10)) {
                    return Integer.MIN_VALUE;
                }
                res = res * 10 + sign * num;
            } else {
                break;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        T7 t7 = new T7();
        System.out.println(t7.FirstNotRepeatingChar("dffff"));
    }

    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = str.toCharArray().length;

        for (int i = 0; i < len; i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (int i = 0; i < len; i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }


}
