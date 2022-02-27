package com.lgy.JZoffer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 字符串的排列
 *
 * @author LGY
 * @create 2022-01-07 19:24
 */
public class String_alignment_38 {

    // 1. 创建一个结果集
    List<String> res = new LinkedList<>();
    // 2. 创建一个 char 数组
    char[] chars;


    public String[] permutation(String s) {
        chars = s.toCharArray();

        dfs(0);
        return res.toArray(new String[res.size()]);
    }

     void dfs(int x) {
        if (x == chars.length - 1) {
            res.add(String.valueOf(chars));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < chars.length; i++) {
            if (set.contains(chars[i])) continue;
            set.add(chars[i]);
            swap(i, x);
            dfs(x+1);
            swap(i,x);
        }
    }

     void swap(int a, int b) {
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;

    }
}
