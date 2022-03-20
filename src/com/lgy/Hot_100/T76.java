package com.lgy.Hot_100;

import java.util.HashMap;
import java.util.Map;

public class T76 {

    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = t.toCharArray();
        for (char c: arr) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //判断满足的个数
        int valid = 0;
        // 窗口的两个指针
        int left = 0;
        int right = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0;
        //2 147 483 647
        int len = Integer.MAX_VALUE;
        while (right < s.length()){
            char c =  s.charAt(right);
            right++;
            if (map.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(map.get(c))){
                    valid++;
                }
            }
            while (valid == map.size()){
                if (right - left < len){
                    start = left;
                    len = right-left;
                }
                char d = s.charAt(left);
                left ++;
                if (map.containsKey(d)){
                    if (window.get(d).equals(map.get(d))){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }

        }
        return len == Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}
