package com.lgy.leetcode;

/**
 *  KMP 算法
 * @author LGY
 * @create 2022-05-04 21:06
 */
public class T28 {
    public int strStr(String haystack, String needle) {

        if (needle == null ){
            return 0;
        }
        int res = -1;

        if (needle.length() > haystack.length()){
            return res;
        }


        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        int temp = 0;
        boolean flag = true;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {

            while (chars[i] == chars1[temp] && temp < chars1.length){

                if (flag){
                    index = i;
                    flag = false;
                }
                i++;
                temp++;
                if (temp == chars1.length){
                    return index;
                }
            }

            if (chars[i]!=chars1[temp]){
                flag = true;
                temp = 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "mississippi";
        String str2 = "issipi";
        T28 t28 = new T28();
        int i = t28.strStr(str1, str2);
    }


    /**
     * 二刷
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr_1(String haystack, String needle) {
        if(needle == ""){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        int len = needle.length();
        for(int i = 0; i<haystack.length();i++){
            if(i + len > haystack.length()){
                break;
            }
            if (haystack.charAt(i) == needle.charAt(0)){
                if (haystack.substring(i,i+len).equals(needle))
                    return i;
            }
        }
        return -1;
    }


    /**
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr_2(String haystack, String needle) {

        if(haystack.length() < needle.length()){
            return -1;
        }
        int l = needle.length();
        int len = haystack.length() - needle.length();


        for(int i = 0 ;i <= len; i++ ){
            if(haystack.substring(i,i+l).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
