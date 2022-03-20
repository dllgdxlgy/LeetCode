package com.lgy.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class All_letter_words_in_the_string_438 {
    public List<Integer> findAnagrams(String s, String p) {

        // 定义一个要返回的 list
        List<Integer> list = new ArrayList<>();

        // 特殊条件判断
        if (s.length() < p.length()) {
            return list;
        }

        // 创建两个map，存放需要的数据
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> windows = new HashMap<>();
        // 把小的字符串转化为数组，放到 map 中
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        // 定义两个指针, 左右指针
        int left = 0;
        int right = 0;
        // 有效数量
        int vaild = 0;
        // 获取长度
        int len = p.length();

        // 循环跳出的条件
        while (right < s.length()) {
            // 得到第一个字符
            char c = s.charAt(right);
            //然后直接加一
            ++right;
            // 判断这个字符是不是在 need 中需要
            if (need.containsKey(c)) {
                // 需要的话，直接放入到里面
                windows.put(c, windows.getOrDefault(c, 0) + 1);

                // 判断里面需要的数量是不是相同了。不相同是不需要增加的。
                if (windows.get(c).equals(need.get(c))) {
                    ++vaild;
                }
            }
            // 判断是不是长度相同
            while (need.size() == vaild) {
                //如果长度相同了，看是不是就是子串
                if (right - left == len) {
                    // 是就直接添加元素
                    list.add(left);
                }
                //去除左边的元素
                char d = s.charAt(left);
                ++left;

                if (need.containsKey(d)) {
                    if (need.get(d).equals(windows.get(d))) {
                        --vaild;
                    }
                    windows.put(d, windows.get(d) - 1);
                }
            }
        }
        return list;
    }
}