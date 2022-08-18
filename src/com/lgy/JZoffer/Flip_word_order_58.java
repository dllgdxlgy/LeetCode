package com.lgy.JZoffer;

import com.lgy.company.leetcodecom.T;

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
            while (i>0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
        return res.toString().trim();
    }

    /**
     *
     * @param s
     * @return
     */
    public String reverseWords_1(String s) {

        String[] res = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = res.length-1; i >= 0; i--) {
            if (res[i].equals("")){
                continue;
            }
            stringBuilder.append(res[i]+" ");
        }

        return stringBuilder.toString().trim();
    }


    public static void main(String[] args) {
        Flip_word_order_58 flip_word_order_58 = new Flip_word_order_58();
        String s = flip_word_order_58.reverseWords_1("sss  ddd   ggg");
        System.out.println(s);

    }
}
