package com.lgy.Hot_xiu_108.Character_String;

import java.util.HashMap;

/**
 * 7. 将字符串转化为整数
 https://www.nowcoder.com/practice/44d8c152c38f43a1b10e168018dcc13f?tpId=188
 &&tqId=38289&rp=1&ru=/activity/oj&qru=/ta/job-code-high-week/question-ranking
 * @author LGY
 * @create 2022-06-14 22:23
 */
public class T7 {

    public static void main(String[] args) {
        T7 t7 = new T7();
        System.out.println( t7.FirstNotRepeatingChar("dffff"));
    }

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
