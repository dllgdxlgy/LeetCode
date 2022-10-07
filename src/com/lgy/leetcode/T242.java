package com.lgy.leetcode;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-10-07 09:47
 */
public class T242 {

    /**
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram_1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    /**
     * T242、有效的字母异位词
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map_1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c_1 = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map_1.put(c_1, map_1.getOrDefault(c_1, 0) + 1);
        }

        for (char c : map.keySet()) {
            // 这里需要注意，有一个长的测试用例，如果使用的是 == ，那就错了。
            if (!map.get(c).equals(map_1.get(c))) {
                return false;
            }
        }
        return true;
    }


}
