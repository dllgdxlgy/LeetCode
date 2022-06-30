package com.lgy.Hot_xiu_108.Double_pointer;

import com.lgy.company.leetcodecom.T;

import java.util.HashMap;

/**
 * @author LGY
 * @create 2022-06-30 14:53
 */
public class T10 {

    public String minWindow (String S, String T) {
        // write code here
        if(T.length() > S.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> windows = new HashMap<>();
        for(char c : T.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int valid = 0;

        int start = 0;
        while(right < S.length()){
            char c = S.charAt(right);
            right++;
            if(map.containsKey(c)){
                windows.put(c,windows.getOrDefault(c,0)+1);
                if(map.get(c).equals(windows.get(c))){
                    valid++;
                }
            }
            while(valid == map.size()){
                if(right-left < len){
                    start = left;
                    len = right-left;
                }
                char d = S.charAt(left);
                left++;
                if(map.containsKey(d)){
                    if(windows.get(d).equals(map.get(d))){
                        valid--;
                    }
                    windows.put(d,windows.get(d)-1);
                }

            }
        }
        return len == Integer.MAX_VALUE?"":S.substring(start,start+len);
    }
}


