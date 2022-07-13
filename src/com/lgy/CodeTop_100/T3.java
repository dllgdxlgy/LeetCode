package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author LGY
 * @create 2022-07-12 15:59
 */
public class T3 {


    /**
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;

        // 记录最大的结果

        int res = 0;
        // 右指针不出界就行
        while(right < s.length()){
            // 取出右节点
            char c = s.charAt(right);
            right++;
            window.put(c,window.getOrDefault(c,0)+1);

            // 注意这里是Integer 的类型，需要使用intValue() 进行转换
            while(window.get(c).intValue() > 1){
                char d = s.charAt(left);
                left++;
                window.put(d,window.getOrDefault(d,1)-1);
            }

            res = Math.max(res,right-left);
        }
        return res;
    }

    public static void main(String[] args) {
        T3 t3 = new T3();
        String s = "pwwkew";
        t3.lengthOfLongestSubstring(s);


    }


}
