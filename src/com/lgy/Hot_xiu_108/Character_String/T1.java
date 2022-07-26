package com.lgy.Hot_xiu_108.Character_String;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 1. 无重复字符的最长子串
 *
 在 leetcode 上

 https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * @author LGY
 * @create 2022-06-11 22:49
 */
public class T1 {


    /**
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        if (s.equals("")){
            return 0;
        }
        char[] arr = s.toCharArray();

        int left = 0;
        int len = arr.length;
        int right = left;

        int res = 1;
        HashMap<Character,Integer> map = new HashMap<>();

        while (right < len){

            char c = arr[right];
            right++;
            map.put(c,map.getOrDefault(c,0)+1);

            while(map.get(c).intValue() > 1){
                char d = arr[left];
                left++;
                map.put(d,map.getOrDefault(d,1)-1);
            }
            res = Math.max(res,right-left);
        }

        return res;
    }


    public static void main(String[] args) {
        String s = "abcdeba";
        T1 t1 = new T1();
        int i = t1.lengthOfLongestSubstring(s);
    }


    /**
     * 题目：最长无重复子数组
     * @param arr
     * @return
     */
    public int maxLength (int[] arr) {
        // write code here
        HashMap<Integer,Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;
        int res = 1;
        while(right < arr.length){
            int temp = arr[right];
            right++;
            window.put(temp,window.getOrDefault(temp,0)+1);


            while(window.get(temp).intValue()>1){
                int temp_2 = arr[left];
                left++;
                window.put(temp_2,window.getOrDefault(temp_2,0)-1);
                if(window.get(temp_2) == 0){
                    window.remove(temp_2);
                }

            }
            res = Math.max(res,right-left);
        }
        return res;
    }
}
