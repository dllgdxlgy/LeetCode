package com.lgy.company.Jingjishijie;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-09-15 18:48
 */
public class jingjishije {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 最长无重复子串，返回值为最长长度子串列表
     *
     * @param strSource string字符串 源字符串S
     * @return string字符串一维数组
     */
    public String[] longestSubstring(String strSource) {
        // write code here
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> res = new HashMap<>();


        int left = 0;
        int right = 0;

        while (right <= strSource.length()) {
            char c = strSource.charAt(right);
            right++;
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.containsKey(c) && map.get(c) > 1) {
                int temp = map.get(left);
                if (temp == 1) {
                    map.remove(left);
                    left++;
                } else {
                    map.put(c, map.get(c) - 1);
                    left++;
                }
            }
            res.put(left, right + 1 - left);
        }
        int temp = Integer.MIN_VALUE;
        for (int i : map.keySet()) {
            if (map.get(i) >= temp) {

            }
        }

        return null;
    }

}
