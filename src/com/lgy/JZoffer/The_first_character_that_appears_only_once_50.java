package com.lgy.JZoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LGY
 * @create 2022-01-09 13:33
 */
public class The_first_character_that_appears_only_once_50 {

    /**
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {

        //创建一个对象
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        for (char mun:array) {
            map.put(mun, map.getOrDefault(mun, 0) + 1);
        }
        for (char mun:array) {
            if (map.get(mun) ==1){
                return mun;
            }
        }
        return ' ';
    }

    public char firstUniqChar_2(String s) {

        //创建一个对象
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();

        for (int i = 0; i<array.length;i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        for (int i = 0; i<array.length;i++) {
            if (map.get(array[i]) ==1){
                return array[i];
            }
        }

        return ' ';
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s = "abaedcba";
        The_first_character_that_appears_only_once_50 t= new The_first_character_that_appears_only_once_50();
        char c = t.firstUniqChar(s);
        System.out.println(c);
    }
}

