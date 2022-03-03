package com.lgy.company.Mei_Tuan;

/**
 * 寻求数字，且寻求的数字最大
 */
public class T2 {

    public int look_for_max_number(String str){
        char[] chars = str.trim().toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i]>'0' &&chars[i]<='9'){

            }
        }


        return 0;
    }

    public static void main(String[] args) {
        String s = "/";
        T2 t2 = new T2();
        t2.look_for_max_number(s);

    }
}
