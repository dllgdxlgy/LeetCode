package com.lgy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Arrangement_of_strings_567 {
    public boolean checkInclusion(String s1, String s2) {

        // 特殊情况判断
        if (s2.length()<s1.length()){
            return false;
        }

        // 两个 map
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> windows = new HashMap<>();
        for (char c: s1.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int left = 0;
        int right = 0;
        int vaild = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        while (right < s2.length()){
            char c = s2.charAt(right);
            right++;
            // 添加后的逻辑

            if (need.containsKey(c)){
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(windows.get(c).equals(need.get(c))){
                    vaild++;
                }
            }
            while (need.size() == vaild){
                if (right-left < len){
                    start = left;
                    len = right-left;
                }
                char d = s2.charAt(left);
                left++;
                if (need.containsKey(d)){
                    if (need.get(d).equals(windows.get(d))){
                        vaild--;
                    }
                    windows.put(d,windows.get(d)-1);
                }

            }


        }
        if (len == s1.length()){
            return true;
        }

        return false;
    }
}
