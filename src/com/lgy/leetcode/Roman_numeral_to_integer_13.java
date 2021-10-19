package com.lgy.leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 */
public class Roman_numeral_to_integer_13 {

    public int romanToInt(String s) {

        if ("".equals(s)){
            return 0;
        }
        int sum = 0 ;
        Map<Character,Integer> map  = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len =  s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i <len-1;i++){
            if (map.get(chars[i])<map.get(chars[i+1])){
                sum =-map.get(chars[i])+sum;
            }else {
                sum = map.get(chars[i])+sum;
            }
        }
        sum=sum+map.get(chars[len-1]);
        return sum;
    }


    public static void main(String[] args)  {

        Roman_numeral_to_integer_13 rnti = new Roman_numeral_to_integer_13();
        System.out.println(rnti.romanToInt("CMXCIX"));

    }
}
