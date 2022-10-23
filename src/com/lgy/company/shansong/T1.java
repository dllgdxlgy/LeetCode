package com.lgy.company.shansong;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-10-23 19:36
 */
public class T1 {

    public char findTheDifference(String s, String t) {
        // write code here
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int[] arr1 = new int[26];
        for (int i = 0; i < t.length(); i++) {
            arr1[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr1[i]) {
                int k = 'a';
                int k1 = i+k;
                return (char)k1;
                //return String.valueOf(k1).charAt(0);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        char theDifference = t1.findTheDifference("abd", "acbd");
        System.out.println(theDifference);
    }
}
