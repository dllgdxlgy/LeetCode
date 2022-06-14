package com.lgy.Hot_xiu_108.Character_String;

import java.util.HashMap;

/**
 * 15. 第一个只出现一次的字符
 https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=188&&tqId=38355
 &rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-14 23:40
 */
public class T15 {

    /**
     * 借助 HashMap
     * @param str
     * @return
     */
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = str.toCharArray().length;

        for(int i = 0; i < len; i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i = 0; i< len; i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
