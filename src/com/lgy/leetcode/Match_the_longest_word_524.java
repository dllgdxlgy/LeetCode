package com.lgy.leetcode;

import java.util.List;

/**
 * @author LGY
 * @create 2022-02-15 17:16
 */
public class Match_the_longest_word_524 {

    public String findLongestWord(String s, List<String> dictionary) {

        String str = "";
        for (int w = 0; w < dictionary.size(); w++) {

            String t = dictionary.get(w);

            // i： 记录遍历 s 的指针位置
            // j： 记录遍历 dictionary 的指针位置
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    i++;
                }
                j++;
            }
            if (i == t.length()) {
                if (t.length()>str.length()||(t.length() == str.length() && t.compareTo(str) < 0)){
                    str = t;
                }
            }

        }

        return str ;
    }
}
