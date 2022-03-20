package com.lgy.Hot_100;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长不含重复字符的子字符串
 */
public class T48 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        //创建数组，每一项代表者以该项为结尾的最长无重复的长度
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int max = 1;
        Map<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(0),0);
        for (int i = 1; i < s.length() ; i++) {
            if (!map.containsKey(s.charAt(i)) || i-map.get(s.charAt(i))>dp[i-1]){
                dp[i] = dp[i-1]+1;
            }else {
                dp[i] = i - map.get(s.charAt(i));
            }
            map.put(s.charAt(i),i);
            if (dp[i] >max) max = dp[i];
        }
        return max;
    }
}
