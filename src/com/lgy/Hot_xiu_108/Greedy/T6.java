package com.lgy.Hot_xiu_108.Greedy;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 402 移调 K 位数字
 *
 https://leetcode.cn/problems/remove-k-digits/
 * @author LGY
 * @create 2022-06-22 17:10
 */
public class T6 {


    public String removeKdigits(String num, int k) {

        int len = num.length();
        if(len == k){
            return "0";
        }

        StringBuilder s = new StringBuilder(num);
        int id = 0;
        for(int i = 0; i < k; i++){

            for(int j = 0; j < s.length()-1;j++){

                if(num.charAt(j) > num.charAt(j+1)){
                    s.deleteCharAt(j);
                    id++;
                    while(s.length() > 1 && s.charAt(0) == '0' ){
                        s.deleteCharAt(0);
                    }
                    break;
                }

            }

        }

        while(id < k){
            s.deleteCharAt(s.length()-1);
            id++;
        }
        return s.toString();
    }


}

