package com.lgy.JZoffer;

/**
 * 反转字符串
 */
public class Flip_word_order_58 {
    public String reverseWords(String s) {
        //删除首位空格
        s.trim();

        int i = s.length()-1;
        int j = i;
        StringBuilder res = new StringBuilder();

        while (i>=0){
            while (i>=0 && s.charAt(i)!=' '){
                i--;
            }
            res.append(s.substring(i+1,j+1)+' ');


        }


        return null;
    }
}
