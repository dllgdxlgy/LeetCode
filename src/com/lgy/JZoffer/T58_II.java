package com.lgy.JZoffer;

/**
 * @author LGY
 * @create 2022-05-25 20:06
 */
public class T58_II {

    public String reverseLeftWords(String s, int n) {

        String substring = s.substring(0, n);
        String substring1 = s.substring(n, s.length());
        String stringBuilder = substring1 + substring;
        return stringBuilder;

    }

    public static void main(String[] args) {
        T58_II t58_ii = new T58_II();
        String s = t58_ii.reverseLeftWords("abfurbhhegwg", 3);
        System.out.println(s);
    }
}
