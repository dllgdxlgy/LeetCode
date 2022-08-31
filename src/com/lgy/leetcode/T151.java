package com.lgy.leetcode;

/**
 * T151 反转字符串中的单词
 * @author LGY
 * @create 2022-08-31 15:54
 */
public class T151 {
    public String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if(s1[i] == ""){
                continue;
            }else {
                sb.append(s1[i]+" ");
            }
        }
        return sb.toString().trim();
    }
}
